package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCodeWilmington;

    @Test
    public void hostLectureTest(){
        //Given
        double expectedNumberOfHours = 10;
        Student student = new Student();
        Instructor instructor = new Instructor();
        //When
        zipCodeWilmington.hostLecture(instructor, expectedNumberOfHours);
        double actualNumberOfHours = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours);

    }
    @Test
    public void hostOfLectureTest(){
        //Given
        double expectedNumberOfHours = 10;
        Instructor i1 = new Instructor(876, "Mark");

        //When
        zipCodeWilmington.hostOfLecture(876, expectedNumberOfHours);

        //Then
    }
}
