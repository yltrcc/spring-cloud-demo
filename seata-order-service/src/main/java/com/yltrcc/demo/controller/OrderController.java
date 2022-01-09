package com.yltrcc.demo.controller;

import com.yltrcc.demo.domain.CommonResult;
import com.yltrcc.demo.domain.Order;
import com.yltrcc.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.controller
 * Date：2022-01-09
 * Time：9:48
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}