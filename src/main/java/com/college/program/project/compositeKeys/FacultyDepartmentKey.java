package com.college.program.project.compositeKeys;

import java.io.Serializable;
import java.util.Objects;

public class FacultyDepartmentKey implements Serializable {

    private Integer facultyId;

    private Integer departmentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyDepartmentKey that = (FacultyDepartmentKey) o;
        return Objects.equals(facultyId, that.facultyId) && Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyId, departmentId);
    }
}
