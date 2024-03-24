package com.patika.kredinbizdenservice.bank.repository;

import com.patika.kredinbizdenservice.bank.entity.Bank;
import com.patika.kredinbizdenservice.campaign.entity.Campaign;
import com.patika.kredinbizdenservice.product.entity.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class MockBankRepo {

    public static List<Bank> getAll(){
        List<CreditCard> creditCards = new ArrayList<>();
        List<Campaign> campaignList = new ArrayList<>();
        List<Bank> banks = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Bank bank = new Bank();
            bank.setName("bank" + i);
            bank.setLoanList(new ArrayList<>());
            bank.setCreditCards(creditCards);
        }
        return banks;
    }
}
