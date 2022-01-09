package com.yltrcc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.yltrcc.demo.controller
 * Date：2022-01-08
 * Time：22:35
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }


}
