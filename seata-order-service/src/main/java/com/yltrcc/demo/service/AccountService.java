package com.yltrcc.demo.service;

import com.yltrcc.demo.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * Package: com.yltrcc.demo.service
 * Date：2022-01-09
 * Time：9:48
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@FeignClient(value = "seata-account-com.yltrcc.demo.service")
public interface AccountService {

    /**
     * 扣减账户余额
     */
    //@RequestMapping(value = "/account/decrease", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}


