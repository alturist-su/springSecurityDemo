package com.spring.security.springSecurity.model;

public class Student {

    private Integer id;
    private String name;
    private Integer marks;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getMarks() {
        return marks;
    }
    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    // Constructor
    public Student(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //toString  method
    @Override
    public String toString() {
        return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
    }

}
