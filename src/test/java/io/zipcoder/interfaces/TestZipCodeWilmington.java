package io.zipcoder.interfaces;

import io.zipcoder.interfaces.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {

    Students students;
    Instructors instructors;
    ZipCodeWilmington zcw;
    Instructor instructor;
    Educator educator;

    @Before
    public void setUp(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
        zcw = ZipCodeWilmington.getInstance();
    }

    @After
    public void tearDown() {
        students.reset();
        instructors.reset();
    }

    @Test
    public void testHostLecture_Instructors(){
        instructor = new Instructor("name", 0L);

        zcw.hostLecture(instructor, 1000);

        Student student = students.getArray()[1];

        Double expectedTime = 1000d/students.getCount();
        Double actualTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testHostLecture_Educator(){
        educator = Educator.DOLIO;

        zcw.hostLecture(educator, 1000);

        Student student = students.getArray()[1];

        Double expectedTime = 1000d/students.getCount();
        Double actualTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }

}
