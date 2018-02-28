package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestZipCodeWilmington {
    Instructor tariq;
    Student charlie;
    @Test
    public void ZipCodeWilmingtonTest(){
        //Given
        Students.getInstance();
        Instructors.getInstance();

        //When
        int expected = 12;
        int actual = ZipCodeWilmington.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HostLectureTest(){
        //Given
        Student student1 = Students.getInstance().getStudentArray()[1];
        Instructors.getInstance();
        Instructor Tariq = new Instructor(432);

        ZipCodeWilmington.getInstance().hostLecture(Tariq, 120);

        //When
        double expected = 20;
        double actual = student1.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .5);

    }

    @Test
    public void HostLectureTest2(){
        Student student1 = Students.getInstance().getStudentArray()[1];

        ZipCodeWilmington.getInstance().hostLecture(151, 120);

        double expected = 20;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .5);
    }
}
