package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington test = ZipCodeWilmington.getInstance();
        Instructors testTeach = Instructors.getInstance();
        Students testStudents = Students.getInstance();

        test.hostLecture(testTeach.toArray()[1], 9);
        Map timeTable = test.getStudyMap();
        Object actual = timeTable.get(testStudents.findById(25L));
        Assert.assertEquals(30, actual);

    }
    @Test
    public void testHostEnumLecture(){
        ZipCodeWilmington test = ZipCodeWilmington.getInstance();
        Students testStudents = Students.getInstance();
        test.hostLecture(Educator.KRIS,12);
        Assert.assertEquals(testStudents.toArray()[1].totalStudyTime,4.0,0);
        }
}
