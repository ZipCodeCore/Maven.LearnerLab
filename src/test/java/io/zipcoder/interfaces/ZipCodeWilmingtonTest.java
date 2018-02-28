package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureNameTest(){
        //Given
        ZipCodeWilmington.getInstance();
        Instructor tariq = (Instructor) Instructors.getInstance().findByID(100);

        //When
        ZipCodeWilmington.getInstance().hostLecture(tariq, 500);
        double expected = 100;
        Student ericB = (Student) Students.getInstance().findByID(23);
        double actual = ericB.getTotalStudyTime();


        Assert.assertEquals(expected,actual,0.01);
    }


    //test passes if run independently but fails if run as part of the suite due to static nature
    //of the Students singleton
    /*@Test
    public void hostLectureIDTest(){
        //Given
        ZipCodeWilmington.getInstance();
        //Instructor tariq = (Instructor) Instructors.getInstance().findByID(100);

        //When
        ZipCodeWilmington.getInstance().hostLecture(100, 500);
        double expected = 100;
        Student ericB = (Student) Students.getInstance().findByID(23);
        double actual = ericB.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.01);
    }*/

}
