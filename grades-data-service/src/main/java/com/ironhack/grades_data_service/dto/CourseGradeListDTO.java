package com.ironhack.grades_data_service.dto;

import com.ironhack.grades_data_service.models.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseGradeListDTO {
    private List<CourseGrade> grades;
}
