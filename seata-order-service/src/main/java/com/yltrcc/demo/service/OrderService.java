package com.yltrcc.demo.service;

import com.yltrcc.demo.domain.Order;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.service
 * Date：2022-01-09
 * Time：9:46
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}