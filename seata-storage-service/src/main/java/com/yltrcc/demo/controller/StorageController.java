package com.yltrcc.demo.controller;

import com.yltrcc.demo.domain.CommonResult;
import com.yltrcc.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.yltrcc.demo.com.yltrcc.demo.controller
 * Date：2022-01-09
 * Time：9:56
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }


}
