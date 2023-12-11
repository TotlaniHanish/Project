package com.college.program.project.repository;

import com.college.program.project.compositeKeys.FacultyCourseKey;
import com.college.program.project.compositeKeys.ProgramCourseKey;
import com.college.program.project.entity.FacultyCourseMap;
import com.college.program.project.entity.ProgramCourseMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyCourseMapRepository extends JpaRepository<FacultyCourseMap, FacultyCourseKey> {
}
