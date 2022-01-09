package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-08
 * Time：22:34
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain {

    public static void main(String[] args) {
        SpringApplication.run(SentinelMain.class, args);
    }

}
