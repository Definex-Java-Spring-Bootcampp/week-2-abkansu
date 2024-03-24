package com.patika.kredinbizdenservice.product.controller;

import com.patika.kredinbizdenservice.enums.OutputStatus;
import com.patika.kredinbizdenservice.product.entity.CreditCard;
import com.patika.kredinbizdenservice.product.model.requestdto.CreditCardSaveRequestDTO;
import com.patika.kredinbizdenservice.product.service.CreditcardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-card")
public class CreditcardController {

    private final CreditcardService creditcardService;

    public CreditcardController(CreditcardService creditcardService) {
        this.creditcardService = creditcardService;
    }


    @PostMapping
    public OutputStatus save(@RequestBody CreditCardSaveRequestDTO creditCardSaveRequestDTO){
        return creditcardService.save(CreditCard.builder().fee(creditCardSaveRequestDTO.getFee()).build());
    }
}
