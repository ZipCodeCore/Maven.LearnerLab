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
        //Given
        Student student1 = Students.getInstance().getStudentArray()[1];
        ZipCodeWilmington.getInstance().hostLecture(151, 120);

        //When
        double expected = 20;
        double actual = student1.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .5);
    }

    @Test
    public void HostLectureEducatorTest(){
        //Given
        Student student1 = Students.getInstance().getArray()[1];
        ZipCodeWilmington.getInstance().hostLecture(Educator.FROILAN, 80);
        double before = 0;

        //When
        double after = student1.getTotalStudyTime();
        double expected = after - before;

        //Then
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }
}
