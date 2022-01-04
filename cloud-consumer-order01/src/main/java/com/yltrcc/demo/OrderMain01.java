package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-05
 * Time：5:24
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain01 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain01.class, args);
    }
}
