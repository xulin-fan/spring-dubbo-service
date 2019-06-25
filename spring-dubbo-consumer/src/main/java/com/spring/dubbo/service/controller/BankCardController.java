package com.spring.dubbo.service.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.spring.dubbo.service.common.BankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by barryfan on 6/22/19.
 */
@RestController
public class BankCardController {


    @Reference(version = "0.0.1")
    private BankCardService bankCardService;

    @GetMapping("/api/bankcard/generator")
    public String generatorCardNo() {
        return bankCardService.generatorCard().getBankName();
    }
}
