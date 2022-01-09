package com.yltrcc.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Package: com.yltrcc.demo.dao
 * Date：2022-01-09
 * Time：9:54
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}