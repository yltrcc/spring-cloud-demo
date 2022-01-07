package com.yltrcc.demo.controller;

import com.yltrcc.demo.PaymentFeignService;
import com.yltrcc.demo.entities.CommonResult;
import com.yltrcc.demo.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Package: com.com.yltrcc.demo.controller
 * Date：2022-01-06
 * Time：7:00
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

}
