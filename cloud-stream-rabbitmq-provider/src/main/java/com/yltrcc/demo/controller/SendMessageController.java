package com.yltrcc.demo.controller;

import com.yltrcc.demo.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Package: com.com.yltrcc.demo.controller
 * Date：2022-01-07
 * Time：5:16
 * Description：TODO
 *
 * @author com.yltrcc
 * @version 1.0
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}
