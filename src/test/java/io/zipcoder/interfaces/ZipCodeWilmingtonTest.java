package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureTest(){
        //Given
        ZipCodeWilmington.getInstance().hostLecture(2000,150);
        Student student = (Student) Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void hostLecture2Test(){
        //Given
        Instructor instructor =(Instructor) Instructors.getInstance().personList.get(1);
        ZipCodeWilmington.getInstance().hostLecture(instructor,150);
        Student student = (Student) Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }
}
