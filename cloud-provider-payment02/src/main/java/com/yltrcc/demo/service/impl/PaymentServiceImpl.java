package com.yltrcc.demo.service.impl;

import com.yltrcc.demo.dao.PaymentDao;
import com.yltrcc.demo.entities.Payment;
import com.yltrcc.demo.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project：spring-cloud-demo
 * package: com.yltrcc.demo.service.impl
 * Date：2022-01-05
 * Time：4:44
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
