package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestZipCodeWilmington {
    @Test
    public void hostLecture() throws Exception {
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();

        Map<Long,Double> studentMap = new HashMap<Long, Double>();
        for(int i=0; i<students.personList.size();i++){
            Student student = (Student)students.personList.get(i);
            studentMap.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }
        zipcode.hostLecture(1,28.0);
        Map<Long,Double> studentMap2 = new HashMap<Long, Double>();
        for(int i=0; i<students.personList.size();i++){
            Student student = (Student)students.personList.get(i);
            studentMap2.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }

        for(Map.Entry m:studentMap.entrySet()){
            assertEquals(m.getValue(),studentMap2.get(m.getKey())-1);
        }

    }
}