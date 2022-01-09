package com.yltrcc.demo.service;

import com.yltrcc.demo.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.service
 * Date：2022-01-09
 * Time：9:47
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@FeignClient(value = "seata-storage-com.yltrcc.demo.service")
public interface StorageService {

    /**
     * 扣减库存
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}


