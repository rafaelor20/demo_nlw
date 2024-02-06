package com.rocketseat.demo_nlw.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
    private UUID id;
    private UUID studentId;
    private String technology;
    private int grade;
    private List<AnswerCertificationsEntity> AnswerCertificationsEntity;
}
