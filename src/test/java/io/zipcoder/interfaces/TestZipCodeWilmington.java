package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();


    @Test
    public void hostLectureTest() {

        HashMap<Long, Double> studentStudyMap1 = new HashMap<>();
        for (int i = 0; i < students.getArray().length; i++) {
            Student student1 = (Student) students.getArray()[i];
            studentStudyMap1.put(student1.getID(), student1.getTotalStudyTime());
        }

        zipcode.hostLecture(1, 52);

        HashMap<Long, Double> studentStudyMap2 = new HashMap<>();
        for (int i = 0; i < students.getArray().length; i++) {
            Student student2 = (Student) students.getArray()[i];
            studentStudyMap2.put(student2.getID(), student2.getTotalStudyTime());
        }

        Assert.assertNotEquals(studentStudyMap1, studentStudyMap2);


    }


}



