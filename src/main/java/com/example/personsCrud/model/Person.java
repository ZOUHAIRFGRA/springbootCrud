package com.example.personsCrud.model;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fname;
    private String lname;
    private int age;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(Long id, String fname, String lname, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
