package com.yltrcc.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

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
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}


