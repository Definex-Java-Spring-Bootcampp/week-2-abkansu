package com.patika.kredinbizdenservice.campaign.service;

import com.patika.kredinbizdenservice.campaign.entity.Campaign;
import com.patika.kredinbizdenservice.campaign.repository.MockCampaignRepo;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CampaignService {

    public List<Campaign> getAllCampaigns(){
        return MockCampaignRepo.getAll().stream().sorted(Comparator.comparing(Campaign::getCreateDate)).toList();
    }
}
