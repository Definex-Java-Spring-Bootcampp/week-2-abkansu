package com.patika.kredinbizdenservice.bank.controller;

import com.patika.kredinbizdenservice.bank.entity.Bank;
import com.patika.kredinbizdenservice.bank.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/list-bank-credit-cards")
    public List<Bank> listBankCreditCards(){
        return bankService.listAllBanksCreditCardCampaigns();
    }
}
