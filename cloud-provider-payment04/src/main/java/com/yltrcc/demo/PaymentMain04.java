package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.com.yltrcc.demo
 * Date：2022-01-05
 * Time：20:27
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain04 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain04.class, args);
    }
}
