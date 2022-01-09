package com.yltrcc.demo.service.impl;

import com.yltrcc.demo.dao.StorageDao;
import com.yltrcc.demo.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Package: com.yltrcc.demo.service.impl
 * Date：2022-01-09
 * Time：9:56
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}