package com.spartaglobal.JsonExamples;

import com.spartaglobal.StudentManager.deserialiser.StudentDTO;
import org.junit.Assert;
import org.junit.Test;

public class StudentDTOTest {

    private StudentDTO studentDTO = new StudentDTO("Resources/Student.json");


    @Test
    public void testStudentAge(){

        Assert.assertEquals(Long.valueOf(21),studentDTO.getAge());
    }

    @Test
    public void testStudentName(){
        Assert.assertEquals("Bailee", studentDTO.getFirstName());
    }

    @Test
    public void testStudentLastName(){
        Assert.assertEquals("Beckles", studentDTO.getLastName());
    }

    @Test
    public void testDegree(){
        Assert.assertEquals("Computer Science", studentDTO.getDegree());
    }

}
