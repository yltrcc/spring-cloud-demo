package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.com.yltrcc.demo
 * Date：2022-01-06
 * Time：3:31
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain06 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain06.class, args);
    }
}
