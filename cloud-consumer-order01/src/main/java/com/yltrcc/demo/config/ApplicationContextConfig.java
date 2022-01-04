package com.yltrcc.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Package: com.yltrcc.demo.config
 * Date：2022-01-05
 * Time：5:56
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * Description：@LoadBalanced注解赋予RestTemplate负载均衡的能力
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
