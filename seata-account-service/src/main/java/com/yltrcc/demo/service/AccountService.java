package com.yltrcc.demo.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.service
 * Date：2022-01-09
 * Time：9:48
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}


