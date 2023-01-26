package com.solvd.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.*;
@XmlRootElement(name = "lecturers")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder={ "id","firstName" , "lastName", "age","email","modules","date" })
public class Lecturers {
    @XmlAttribute
    private Long id;
    @XmlElement(name="firstName",required = true)
    private String firstName;
    @XmlElement(name="lastName")
    private String lastName;
    @XmlElement(name="email")
    private String email;
    @XmlElement(name="age")
    private int age;
    @XmlElementWrapper(name="modules")
    private List<String> modules;
//    private ArrayList<Modules> moduleList = new ArrayList<Modules>();
  @XmlElement(name="date")
    private Date startDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }


    public Date getStartDate() {
        return startDate;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Lecturers() {
    }

    public Lecturers(Long id, String firstName, String lastName, String email, int age, List<String> modules, Date startDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.modules = modules;
        this.startDate = startDate;
    }

    public void setStartDate() {
        Date startDate;
    }


}
