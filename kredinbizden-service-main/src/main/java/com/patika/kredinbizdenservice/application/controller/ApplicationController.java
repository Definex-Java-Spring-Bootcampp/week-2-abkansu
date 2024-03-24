package com.patika.kredinbizdenservice.application.controller;

import com.patika.kredinbizdenservice.application.model.responsedto.ApplicationResponseDTO;
import com.patika.kredinbizdenservice.application.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/application")
public class ApplicationController {

    private final ApplicationService applicationService;


    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/get-all-applications/{email}")
    public List<ApplicationResponseDTO> getAllApplicationsViaEmail(@PathVariable(value = "email") String email) {
        return applicationService.listApplicationsByEmail(email);
    }
}
