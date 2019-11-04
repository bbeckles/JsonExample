package com.spartaglobal.StudentManager.serialiser;

import com.spartaglobal.StudentManager.StudentFactory;
import org.json.simple.JSONObject;

import java.io.File;

public class JsonStudentFactory {

    private JSONObject studentJson = new JSONObject();
    private StudentFactory student;

    public JsonStudentFactory(StudentFactory student){
        this.student = student;
        studentJson.put("firstName", student.getFirstName());
        studentJson.put("lastName",student.getLastName());
        studentJson.put("degree", student.getDegree());
        studentJson.put("age", student.getAge());
    }

    public void printStudentJSON(){
        System.out.println(studentJson);
    }



}
