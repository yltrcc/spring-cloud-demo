package com.yltrcc.demo.service;

import com.yltrcc.demo.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Project：spring-cloud-demo
 * package: com.yltrcc.demo.service
 * Date：2022-01-05
 * Time：4:43
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface PaymentService {

    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
