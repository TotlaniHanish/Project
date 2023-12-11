package com.college.program.project.entity;

import com.college.program.project.compositeKeys.StudentCourseKey;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="StudentCourseMap")
@IdClass(StudentCourseKey.class)
@Data
public class StudentCourseMap {

    @Id
    private Integer studentId;

    @Id
    private Integer courseId;

    private String semester;

    private String section;

    public Integer getStudentIdentityKey() {
        return studentId;
    }

    public Integer getCourseIdentityKey() {
        return courseId;
    }

}
