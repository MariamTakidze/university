package com.solvd.models;

public class AcademicRank {
    private Long id;
    private String academicRankTitle;

    public AcademicRank(Long id, String academicRankTitle) {
        this.id = id;
        this.academicRankTitle = academicRankTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcademicRankTitle() {
        return academicRankTitle;
    }

    public void setAcademicRankTitle(String academicRankTitle) {
        this.academicRankTitle = academicRankTitle;
    }
}
