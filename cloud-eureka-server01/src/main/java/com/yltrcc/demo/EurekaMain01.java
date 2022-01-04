package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-05
 * Time：6:26
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain01.class, args);
    }
}
