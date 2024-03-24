package com.patika.kredinbizdenservice.campaign.controller;

import com.patika.kredinbizdenservice.campaign.service.CampaignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campaign")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping("/list-campaigns")
    public void listCampaigns(){
        campaignService.getAllCampaigns();
    }
}
