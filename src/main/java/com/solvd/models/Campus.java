package com.solvd.models;

public class Campus {
    private Long id;
    private String campusName;
    private String campusLocation;

    public Campus(Long id, String campusName, String campusLocation) {
        this.id = id;
        this.campusName = campusName;
        this.campusLocation = campusLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getCampusLocation() {
        return campusLocation;
    }

    public void setCampusLocation(String campusLocation) {
        this.campusLocation = campusLocation;
    }
}
