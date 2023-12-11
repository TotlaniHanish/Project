package com.college.program.project.repository;

import com.college.program.project.compositeKeys.StudentCourseKey;
import com.college.program.project.entity.StudentCourseMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseMapRepository extends JpaRepository<StudentCourseMap, StudentCourseKey> {
}
