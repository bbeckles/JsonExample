package com.spartaglobal.StudentManager;

import org.json.simple.JSONObject;

public class StudentFactory {


    private  String firstName;
    private String lastName;
    private String degree;
    private Long age;

    public StudentFactory(String firstName, String lastName, String degree, Long age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    public Long getAge() {
        return age;
    }


}
