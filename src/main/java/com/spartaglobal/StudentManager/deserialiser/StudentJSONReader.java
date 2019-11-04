package com.spartaglobal.StudentManager.deserialiser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentJSONReader {
    private JSONObject  studentJSONDetails;
    public StudentJSONReader(String fileName) {
        try {

            // simple file reader object
            FileReader studentJson = new FileReader(fileName);
            // Deserialising string to object
            JSONParser jsonParser = new JSONParser();
            Object studentObject = jsonParser.parse(studentJson);

            // JSON simple needs a cast from object to the JSON simple object of JSONObject
            studentJSONDetails = (JSONObject) studentObject;

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }
        public JSONObject getStudentJSONDetails(){
            return studentJSONDetails;
        }
    }

