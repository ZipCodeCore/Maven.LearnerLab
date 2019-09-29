package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTestTwo(){
        //Given
        Instructor instructor =(Instructor) Instructors.getInstance().personList.get(1);
        ZipCodeWilmington.getInstance().hostLecture(instructor,150);
        Student student = (Student) Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }


    @Test
    public void hostLectureTestOne(){
        //Given
        ZipCodeWilmington.getInstance().hostLecture(9871,150);
        Student student = (Student) Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testEducatorHostLecture(){
        //Given
        ZipCodeWilmington.getInstance().hostLecture(Educator.LEON,150);
        Student student = (Student) Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }



}




