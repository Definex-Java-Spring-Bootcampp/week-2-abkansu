package com.patika.kredinbizdenservice.application.service;

import com.patika.kredinbizdenservice.application.entity.Application;
import com.patika.kredinbizdenservice.application.model.responsedto.ApplicationResponseDTO;
import com.patika.kredinbizdenservice.application.repository.MockApplicationRepo;
import com.patika.kredinbizdenservice.user.repository.MockUserRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationService {
    private final MockApplicationRepo mockApplicationRepo;

    public ApplicationService(MockUserRepo mockUserRepo) {
        this.mockApplicationRepo = new MockApplicationRepo(mockUserRepo);
    }

    public List<Application> getAllApplicationsInOneMonth() {
        return mockApplicationRepo.getAll().stream()
                .filter(application -> application.getLocalDateTime()
                        .isAfter(LocalDateTime.now().minusMonths(1))).toList();
    }

    public List<ApplicationResponseDTO> listApplicationsByEmail(String email) {
        List<Application> applications = mockApplicationRepo.getAll().stream().filter(application -> application.getUser().getEmail().equals(email)).toList();
        return applications.stream().map(application -> {
            ApplicationResponseDTO applicationResponseDTO = new ApplicationResponseDTO();
            applicationResponseDTO.setApplicationStatus(application.getApplicationStatus());
            applicationResponseDTO.setLoanAmount(application.getLoan().getAmount());
            applicationResponseDTO.setLocalDateTime(application.getLocalDateTime());
            applicationResponseDTO.setUserId(application.getUser().getName());
            return applicationResponseDTO;
        }).toList();
    }
}
