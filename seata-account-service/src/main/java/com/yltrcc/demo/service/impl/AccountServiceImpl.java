package com.yltrcc.demo.service.impl;

import com.yltrcc.demo.dao.AccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.yltrcc.demo.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.service.impl
 * Date：2022-01-09
 * Time：9:47
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        //try { TimeUnit.SECONDS.sleep(30); } catch (InterruptedException e) { e.printStackTrace(); }
        accountDao.decrease(userId,money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}