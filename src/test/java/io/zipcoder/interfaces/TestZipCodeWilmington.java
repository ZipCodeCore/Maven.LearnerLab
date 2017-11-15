package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.*;
import io.zipcoder.interfaces.Enum.Educator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {

    Instructors instructors = Instructors.getInstructors();
    Students students = Students.getINSTANCE();
    ZipCodeWilmington zipCodeWilmington;

    @Before
    public void setUp(){
        Educator.values();
        zipCodeWilmington = new ZipCodeWilmington();
    }

    @Test
    public void hostLectureTestWithID(){
        Student testStudent  = students.findById(25);
        double startStudyTime = testStudent.getTotalStudyTime();

        zipCodeWilmington.hostLecture(1001,100);

        double endStudyTime = testStudent.getTotalStudyTime();
        Assert.assertTrue(endStudyTime>startStudyTime);

    }

    @Test
    public void hostLectureTestWithTeacher(){
        Student testStudent  = students.findById(25);
        double startStudyTime = testStudent.getTotalStudyTime();

        Instructor testInstructor = instructors.findById(1001);
        zipCodeWilmington.hostLecture(testInstructor,100);

        double endStudyTime = testStudent.getTotalStudyTime();
        Assert.assertTrue(endStudyTime>startStudyTime);

    }

}
