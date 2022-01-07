package com.yltrcc.demo;

import com.yltrcc.demo.entities.CommonResult;
import com.yltrcc.demo.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Package: com.com.yltrcc.demo
 * Date：2022-01-06
 * Time：7:00
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}

