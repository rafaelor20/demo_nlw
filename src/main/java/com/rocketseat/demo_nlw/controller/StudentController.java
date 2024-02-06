package com.rocketseat.demo_nlw.controller;

import com.rocketseat.demo_nlw.dto.StudentVerifyDto;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.rocketseat.demo_nlw.service.VerifyIfHasCertification;

@RestController
@RequestMapping("/students")
public class StudentController {
    private VerifyIfHasCertification verifyIfHasCertification;

    @Autowired
    @PostMapping("/verifyCertification")
    public String verifyIfHasCertification(@RequestBody StudentVerifyDto studentVerifyDto) {
        boolean hasCertification = verifyIfHasCertification.execute(studentVerifyDto);
        if (hasCertification) {
            return "Has certification";
        } else {
            return "Does not have certification";
        }
    }
}
