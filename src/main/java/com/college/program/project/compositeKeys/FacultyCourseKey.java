package com.college.program.project.compositeKeys;

import java.io.Serializable;
import java.util.Objects;

public class FacultyCourseKey implements Serializable {

    private Integer facultyId;

    private Integer courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyCourseKey that = (FacultyCourseKey) o;
        return Objects.equals(facultyId, that.facultyId) && Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyId, courseId);
    }
}
