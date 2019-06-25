package com.spring.dubbo.service.implmock;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.dubbo.service.common.BankCardPo;
import com.spring.dubbo.service.common.BankCardService;

/**
 * Created by barryfan on 6/24/19.
 */
@Service(version = "0.0.1")
public class BankCardServiceImpl implements BankCardService {

    @Override
    public BankCardPo generatorCard() {
        BankCardPo bankCardPo = new BankCardPo();
        bankCardPo.setCardNo("123123");
        bankCardPo.setBankName("招商");
        return bankCardPo;
    }
}
