package com.yltrcc.demo.controller;

import com.yltrcc.demo.entities.CommonResult;
import com.yltrcc.demo.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Package: com.yltrcc.demo.controller
 * Date：2022-01-05
 * Time：5:49
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
public class OrderController {

    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/create")

    public CommonResult create(@RequestBody Payment payment)
    {
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/add",payment,CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id)
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/"+id, CommonResult.class, id);
    }

}
