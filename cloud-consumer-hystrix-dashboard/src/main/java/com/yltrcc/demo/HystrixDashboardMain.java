package com.yltrcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Package: com.com.yltrcc.demo
 * Date：2022-01-06
 * Time：21:06
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain.class, args);
    }

}
