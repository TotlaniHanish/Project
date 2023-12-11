package com.college.program.project.entity;

import com.college.program.project.compositeKeys.ProgramCourseKey;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="ProgramCourseMap")
@IdClass(ProgramCourseKey.class)
@Data
public class ProgramCourseMap {

    @Id
    private Integer programId;

    @Id
    private Integer courseId;

    public Integer getProgramIdentityKey() {
        return programId;
    }

    public Integer getCourseIdentityKey() {
        return courseId;
    }

}
