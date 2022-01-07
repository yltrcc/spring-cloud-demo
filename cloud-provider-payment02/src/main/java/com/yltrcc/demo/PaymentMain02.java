package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-05
 * Time：6:53
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain02 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain02.class, args);
    }
}
