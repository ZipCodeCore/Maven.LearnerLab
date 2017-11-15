package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.*;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {


    Instructors instructors = Instructors.getInstructors();
    Students students = Students.getINSTANCE();


    @Test
    public void hostLectureTestWithID(){

        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student testStudent  = students.findById(25);

        zipCodeWilmington.hostLecture(1001,100);
        double expected = 7;

        double actual = Math.floor(testStudent.getTotalStudyTime());

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void hostLectureTestWithTeacher(){

        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student testStudent  = students.findById(25);

        zipCodeWilmington.hostLecture(instructors.findById(1001),100);
        double expected = 3;

        double actual = Math.floor(testStudent.getTotalStudyTime());

        Assert.assertEquals(expected,actual,0);

    }

}
