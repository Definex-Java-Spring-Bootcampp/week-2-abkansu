package com.patika.kredinbizdenservice.bank.service;

import com.patika.kredinbizdenservice.bank.entity.Bank;
import com.patika.kredinbizdenservice.bank.repository.MockBankRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {


    public List<Bank> listAllBanksCreditCardCampaigns(){
        return MockBankRepo.getAll();
    }
}
