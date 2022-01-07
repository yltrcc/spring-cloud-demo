package com.yltrcc.ribbon.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Package: com.com.yltrcc.ribbon.config
 * Date：2022-01-06
 * Time：5:03
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@Configuration
public class FooConfiguration {

    @Bean
    public IRule myRule() {
//        return new RandomRule();//定义为随机
        return new EveryServiceFiveRule();
    }

}