package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-09
 * Time：10:06
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeataAccountMain {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMain.class, args);
    }

}
