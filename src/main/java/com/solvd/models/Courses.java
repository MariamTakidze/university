package com.solvd.models;

public class Courses {
    private Long id;
    private String courseTitle;

    public Courses(Long id, String courseTitle) {
        this.id = id;
        this.courseTitle = courseTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}
