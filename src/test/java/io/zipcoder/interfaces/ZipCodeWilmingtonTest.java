package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureWithIdTest(){
        //Given
        ZipCodeWilmington.getInstance().hostLecture(2000,150);
        Student student =  Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void hostLectureWithInstructorTest(){
        //Given
        Instructor instructor = Instructors.getInstance().personList.get(1);
        ZipCodeWilmington.getInstance().hostLecture(instructor,150);
        Student student = Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }
    @Test
    public void hostLectureWithEducatorTest(){
        //Given
        ZipCodeWilmington.getInstance().hostLecture(Educator.LEON,150);
        Student student =  Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }

}
