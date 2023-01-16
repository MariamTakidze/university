package com.solvd.models;

public class Semesters {
    private Long id;
    private Long semesterYear;
    private Long semesterCode;

    public Semesters(Long id, Long semesterYear, Long semesterCode) {
        this.id = id;
        this.semesterYear = semesterYear;
        this.semesterCode = semesterCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(Long semesterYear) {
        this.semesterYear = semesterYear;
    }

    public Long getSemesterCode() {
        return semesterCode;
    }

    public void setSemesterCode(Long semesterCode) {
        this.semesterCode = semesterCode;
    }
}
