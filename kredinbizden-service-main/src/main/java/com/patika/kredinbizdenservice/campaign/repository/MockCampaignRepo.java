package com.patika.kredinbizdenservice.campaign.repository;

import com.patika.kredinbizdenservice.bank.entity.Bank;
import com.patika.kredinbizdenservice.campaign.entity.Campaign;

import java.util.ArrayList;
import java.util.List;

public class MockCampaignRepo {

    public static List<Campaign> getAll(){
        List<Campaign> campaigns = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Campaign campaign = new Campaign();
        }
        return campaigns;
    }
}
