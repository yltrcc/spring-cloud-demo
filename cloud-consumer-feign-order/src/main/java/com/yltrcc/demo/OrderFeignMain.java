package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Package: com.com.yltrcc.demo
 * Date：2022-01-06
 * Time：6:57
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class, args);
    }

}
