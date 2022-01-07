package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-07
 * Time：1:02
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain {

    public static void main(String[] args) {
        SpringApplication.run(GateWayMain.class, args);
    }

}
