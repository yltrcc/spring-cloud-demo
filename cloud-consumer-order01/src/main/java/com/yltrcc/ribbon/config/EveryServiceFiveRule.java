package com.yltrcc.ribbon.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Package: com.yltrcc.ribbon.config
 * Date：2022-01-06
 * Time：5:30
 * Description：每个服务都访问5次之后再切换下一个服务
 *
 * @author yltrcc
 * @version 1.0
 */
public class EveryServiceFiveRule extends AbstractLoadBalancerRule {

    public EveryServiceFiveRule() {
    }

    private int total=0;             //当前调用次数
    private int currentIndex=0;      //当前被引用的服务

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                //自定义的负载均衡算法
                if (total<5){
                    server=upList.get(currentIndex);
                    total++;
                }else{
                    total=0;
                    currentIndex++;
                    if (currentIndex>upList.size()-1){
                        currentIndex=0;
                    }
                    server=upList.get(currentIndex);
                }
                /*
                Ribbon自带的一个获取随机Server的算法
                int index = this.chooseRandomInt(serverCount);
                server = (Server)upList.get(index);
                */

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }

}
