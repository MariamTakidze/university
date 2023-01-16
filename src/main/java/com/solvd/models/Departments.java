package com.solvd.models;

public class Departments {
    private Long id;
    private String departmentTitle;

    public Departments(Long id, String departmentTitle) {
        this.id = id;
        this.departmentTitle = departmentTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }
}
