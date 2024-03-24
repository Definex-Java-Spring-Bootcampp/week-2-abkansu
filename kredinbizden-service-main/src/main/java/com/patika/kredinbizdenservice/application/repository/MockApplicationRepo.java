package com.patika.kredinbizdenservice.application.repository;

import com.patika.kredinbizdenservice.user.repository.MockUserRepo;
import com.patika.kredinbizdenservice.application.entity.Application;
import com.patika.kredinbizdenservice.user.entity.User;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class MockApplicationRepo {
    private final MockUserRepo mockUserRepo;

    public MockApplicationRepo(MockUserRepo mockUserRepo) {
        this.mockUserRepo = mockUserRepo;
    }

    public List<Application> getAll(){
        return mockUserRepo.getAll().stream().map(User::getApplicationList).flatMap(List::stream).toList();
    }
}
