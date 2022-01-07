package com.yltrcc.demo;

import com.yltrcc.ribbon.config.FooConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-05
 * Time：5:24
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = FooConfiguration.class)
public class OrderMain01 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain01.class, args);
    }
}
