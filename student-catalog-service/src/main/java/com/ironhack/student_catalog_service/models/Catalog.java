package com.ironhack.student_catalog_service.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catalog {
    @Id
    private String courseName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "catalog")
    private List<StudentGrade> studentGrades;
}
