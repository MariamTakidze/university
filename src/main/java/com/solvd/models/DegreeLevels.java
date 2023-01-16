package com.solvd.models;

public class DegreeLevels {
    private Long id;
    private String degreeLevelTitle;
    private String degreeLevelDescription;

    public DegreeLevels(Long id, String degreeLevelTitle, String degreeLevelDescription) {
        this.id = id;
        this.degreeLevelTitle = degreeLevelTitle;
        this.degreeLevelDescription = degreeLevelDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDegreeLevelTitle() {
        return degreeLevelTitle;
    }

    public void setDegreeLevelTitle(String degreeLevelTitle) {
        this.degreeLevelTitle = degreeLevelTitle;
    }

    public String getDegreeLevelDescription() {
        return degreeLevelDescription;
    }

    public void setDegreeLevelDescription(String degreeLevelDescription) {
        this.degreeLevelDescription = degreeLevelDescription;
    }
}
