package com.rocketseat.demo_nlw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentVerifyDto {
    private String email;
    private String tecnology;

}
