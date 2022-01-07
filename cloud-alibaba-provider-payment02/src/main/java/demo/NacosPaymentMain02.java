package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.yltrcc.demo
 * Date：2022-01-07
 * Time：23:37
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain02 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain02.class, args);
    }

}
