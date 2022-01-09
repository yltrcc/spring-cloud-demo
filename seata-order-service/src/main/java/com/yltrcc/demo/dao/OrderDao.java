package com.yltrcc.demo.dao;

import com.yltrcc.demo.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.dao
 * Date：2022-01-09
 * Time：9:44
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}


