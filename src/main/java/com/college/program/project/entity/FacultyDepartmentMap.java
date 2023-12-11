package com.college.program.project.entity;

import com.college.program.project.compositeKeys.FacultyDepartmentKey;
import com.college.program.project.compositeKeys.ProgramCourseKey;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="FacultyDepartmentMap")
@IdClass(FacultyDepartmentKey.class)
@Data
public class FacultyDepartmentMap {

    @Id
    private Integer facultyId;

    @Id
    private Integer departmentId;

    public Integer getFacultyIdentityKey() {
        return facultyId;
    }

    public Integer getDepartmentIdentityKey() {
        return departmentId;
    }

}
