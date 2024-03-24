package com.patika.kredinbizdenservice.product.repository;

import com.patika.kredinbizdenservice.campaign.entity.enums.SectorType;
import com.patika.kredinbizdenservice.campaign.entity.Campaign;
import com.patika.kredinbizdenservice.product.entity.CreditCard;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class MockCreditCardRepo {

    public static List<CreditCard> getAll(){
        List<CreditCard> creditCardList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            List<Campaign> campaignList = new ArrayList<>();
            int random = 3 + (int)(Math.random() * ((15 - 3) + 1));
            for(int j = 0; j < random; j++){
                campaignList.add(
                        new Campaign("campaign" + j, "content" + j, LocalDate.now(), LocalDate.now(), LocalDate.now(), SectorType.OTHERS)
                );
            }
            creditCardList.add(
                    new CreditCard(BigDecimal.TEN, campaignList)
            );
        }
        return creditCardList;
    }
}
