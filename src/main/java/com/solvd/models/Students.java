package com.solvd.models;

public class Students {
    private Long id;
    private String studentName;
    private String studentLastname;
    private String studentEmail;
    private int age;

    public Students(Long id, String studentName, String studentLastname, String studentEmail, int age) {
        this.id = id;
        this.studentName = studentName;
        this.studentLastname = studentLastname;
        this.studentEmail = studentEmail;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
