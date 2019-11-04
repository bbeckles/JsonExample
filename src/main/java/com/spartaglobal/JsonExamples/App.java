package com.spartaglobal.JsonExamples;

import com.spartaglobal.StudentManager.StudentFactory;
import com.spartaglobal.StudentManager.deserialiser.StudentDTO;
import com.spartaglobal.StudentManager.serialiser.JsonStudentFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        StudentFactory student1 = new StudentFactory("Bailee", "Beckles", "Comp Sci", 21);
//        JsonStudentFactory studentJson = new JsonStudentFactory(student1);
//        studentJson.printStudentJSON();
//        studentJson.generateJsonStudentFile();

        StudentDTO studentDTO = new StudentDTO("resources/student.json");
        System.out.println(studentDTO.getAge());
    }
}
