package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-05
 * Time：6:47
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain02 {
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain02.class, args);
    }
}
