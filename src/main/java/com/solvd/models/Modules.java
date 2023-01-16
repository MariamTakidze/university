package com.solvd.models;

public class Modules {
    private Long id;
    private String moduleTitle;

    public Modules(Long id, String moduleTitle) {
        this.id = id;
        this.moduleTitle = moduleTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }
}
