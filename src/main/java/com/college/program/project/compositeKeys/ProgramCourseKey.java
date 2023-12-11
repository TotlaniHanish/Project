package com.college.program.project.compositeKeys;

import java.io.Serializable;
import java.util.Objects;

public class ProgramCourseKey implements Serializable {

    private Integer programId;

    private Integer courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramCourseKey that = (ProgramCourseKey) o;
        return Objects.equals(programId, that.programId) && Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programId, courseId);
    }
}
