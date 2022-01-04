package com.yltrcc.demo.dao;

import com.yltrcc.demo.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Project：spring-cloud-demo
 * package: com.yltrcc.demo.dao
 * Date：2022-01-05
 * Time：4:42
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Mapper
public interface PaymentDao {

    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
