package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

    @Test
    public void hostLectureTest(){
        //Given
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getINSTANCE();
        Student student = (Student) students.findPersonById(4);

        //When
        double expectedNumberOfHours = 100;
        ZipCodeWilmington.hostOfLecture(6, 100);
        double actualNumberOfHours = student.getTotalStudyTime();


        //Then
        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours);


    }

}
