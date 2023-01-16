package com.solvd.models;

public class Universities {
    private Long id;
    private String universityTitle;
    private String universityAddress;
    private String universityEmail;

    public Universities(Long id, String universityTitle, String universityAddress, String universityEmail) {
        this.id = id;
        this.universityTitle = universityTitle;
        this.universityAddress = universityAddress;
        this.universityEmail = universityEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversityTitle() {
        return universityTitle;
    }

    public void setUniversityTitle(String universityTitle) {
        this.universityTitle = universityTitle;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public String getUniversityEmail() {
        return universityEmail;
    }

    public void setUniversityEmail(String universityEmail) {
        this.universityEmail = universityEmail;
    }
}
