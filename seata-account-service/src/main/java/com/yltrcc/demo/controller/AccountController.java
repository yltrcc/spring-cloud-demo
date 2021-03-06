package com.yltrcc.demo.controller;

import com.yltrcc.demo.domain.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yltrcc.demo.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Package: com.yltrcc.demo.controller
 * Date：2022-01-09
 * Time：9:48
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }

}