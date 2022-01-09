package com.yltrcc.demo.service;

/**
 * Package: com.yltrcc.demo.service
 * Date：2022-01-09
 * Time：9:56
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

