package com.yltrcc.demo.controller;

import com.yltrcc.demo.entities.CommonResult;
import com.yltrcc.demo.entities.Payment;
import com.yltrcc.demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Project：spring-cloud-demo
 * package: com.yltrcc.demo.controller
 * Date：2022-01-05
 * Time：4:45
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.insert(payment);
        log.info("*****插入操作返回结果:" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:{}", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
        }
    }

}
