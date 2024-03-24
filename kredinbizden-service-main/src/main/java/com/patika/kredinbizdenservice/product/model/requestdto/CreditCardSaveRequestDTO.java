package com.patika.kredinbizdenservice.product.model.requestdto;

import com.patika.kredinbizdenservice.bank.entity.Bank;
import com.patika.kredinbizdenservice.campaign.entity.Campaign;

import java.math.BigDecimal;
import java.util.List;

public class CreditCardSaveRequestDTO {

    private BigDecimal fee;

    private String bank;

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
