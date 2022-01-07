package com.yltrcc.demo.service;

import org.springframework.stereotype.Component;

/**
 * Package: com.com.yltrcc.demo.service
 * Date：2022-01-06
 * Time：20:21
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@Component
public class PaymentFallbackService  implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---- PaymentFallbackService fall back - paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---- PaymentFallbackService fall back - paymentInfo_TimeOut, o(╥﹏╥)o";
    }
}
