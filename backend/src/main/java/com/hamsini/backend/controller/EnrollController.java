package com.hamsini.backend.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamsini.backend.model.EnrollRequest;
import com.hamsini.backend.repository.EnrollRepository;


@RestController
@RequestMapping("/api/enroll")
public class EnrollController {
     @Autowired
    private EnrollRepository enrollRepo;

    @PostMapping
    public String enrollUser(@RequestBody EnrollRequest enroll) {
        enrollRepo.save(enroll);
        return "Enrollment Successful!";
    }

    
}

        


