package com.solvd.models;

public class Schools {
    private Long id;
    private String schoolName;

    public Schools(Long id, String schoolName) {
        this.id = id;
        this.schoolName = schoolName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
