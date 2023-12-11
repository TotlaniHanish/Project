package com.college.program.project.repository;

import com.college.program.project.compositeKeys.ProgramCourseKey;
import com.college.program.project.entity.ProgramCourseMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramCourseMapRepository extends JpaRepository<ProgramCourseMap, ProgramCourseKey> {
}
