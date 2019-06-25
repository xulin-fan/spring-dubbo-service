package com.spring.dubbo.service.common;

import java.io.Serializable;

/**
 * Created by barryfan on 6/24/19.
 */
public class BankCardPo implements Serializable {

    private String cardNo;
    private String bankName;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
