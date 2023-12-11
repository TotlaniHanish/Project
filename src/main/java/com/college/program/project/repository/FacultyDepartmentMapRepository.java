package com.college.program.project.repository;

import com.college.program.project.compositeKeys.FacultyCourseKey;
import com.college.program.project.compositeKeys.FacultyDepartmentKey;
import com.college.program.project.entity.FacultyCourseMap;
import com.college.program.project.entity.FacultyDepartmentMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyDepartmentMapRepository extends JpaRepository<FacultyDepartmentMap, FacultyDepartmentKey> {
}
