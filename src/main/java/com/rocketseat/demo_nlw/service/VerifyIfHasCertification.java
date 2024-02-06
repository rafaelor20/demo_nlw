package com.rocketseat.demo_nlw.service;

import com.rocketseat.demo_nlw.dto.StudentVerifyDto;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertification {
    public boolean execute(StudentVerifyDto dto) {
        if (dto.getEmail().equals("teste@teste.com") && dto.getTecnology().equals("java")) {
            return true;
        } else {
            return false;
        }
    }
}
