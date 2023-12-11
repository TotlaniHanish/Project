package com.college.program.project.entity;

import com.college.program.project.compositeKeys.FacultyCourseKey;
import com.college.program.project.compositeKeys.ProgramCourseKey;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="FacultyCourseMap")
@IdClass(FacultyCourseKey.class)
@Data
public class FacultyCourseMap {

    @Id
    private Integer facultyId;

    @Id
    private Integer courseId;

    private String semester;

    private String section;
    public Integer getFacultyIdentityKey() {
        return facultyId;
    }

    public Integer getCourseIdentityKey() {
        return courseId;
    }

}
