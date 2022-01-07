package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-08
 * Time：4:22
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain.class, args);
    }

}
