package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture1(){
        Instructor teacher = Instructors.getInstance().findById(1);
        Students students = Students.getInstance();

        ZipCodeWilmington.hostLecture(teacher, 30);

        Double expected = 10.0;
        Double actual = 30D/students.personList.size();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testHostLecture2(){
        Long teacherId = 1L;
        Students students = Students.getInstance();

        ZipCodeWilmington.hostLecture(teacherId, 60);

        Double expected = 20.0;
        Double actual = 60D/students.personList.size();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testGetStudyMap(){
        Student expectedS1 = Students.getInstance().findById(1);
        Student expectedS2 = Students.getInstance().findById(2);
        Double expectedTimeS1 = Students.getInstance().findById(1).getTotalStudyTime();
        Double expectedTimeS2 = Students.getInstance().findById(1).getTotalStudyTime();

        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsKey(expectedS1));
        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsKey(expectedS2));

        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsValue(expectedTimeS1));
        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsValue(expectedTimeS2));
    }
}
