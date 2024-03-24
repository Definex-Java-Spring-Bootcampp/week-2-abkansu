package com.patika.kredinbizdenservice.product.service;

import com.patika.kredinbizdenservice.enums.OutputStatus;
import com.patika.kredinbizdenservice.product.repository.MockCreditCardRepo;
import com.patika.kredinbizdenservice.product.entity.CreditCard;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class CreditcardService {
    private final List<CreditCard> creditCardList;

    public CreditcardService(){
        this.creditCardList = MockCreditCardRepo.getAll();
    }

    public List<CreditCard> listCampaigns(){
        List<CreditCard> sorted = new java.util.ArrayList<>(creditCardList.stream().sorted(Comparator.comparing(creditCard -> creditCard.getCampaignList().size())).toList());
        Collections.reverse(sorted);
        sorted.forEach(creditCard -> System.out.println(creditCard.toString()));
        return sorted;
    }

    public OutputStatus save(CreditCard creditCard){
        // repository.save(creditCard)
        return OutputStatus.SUCCESS;
    }
}
