package com.ironhack.student_catalog_service.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentGrade {
    @Id
    private String name;
    private int age;
    private int grade;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="course_name")
    private Catalog catalog;
}
