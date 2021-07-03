package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureNameTest(){
        //Given
        ZipCodeWilmington.getInstance();

        //When
        ZipCodeWilmington.getInstance().hostLecture(Educator.TARIQ, 500);
        double expected = 100;
        Student ericB = Students.getInstance().findByID(23);
        double actual = ericB.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.01);
    }


    //test passes if run independently but fails if run as part of the suite due to static nature
    //of the Students singleton
    @Test
    public void hostLectureIDTest(){
        //Given
        ZipCodeWilmington.getInstance();
        Student spanky = new Student(69);
        Educator.TARIQ.teach(spanky,0);

        //When
        ZipCodeWilmington.getInstance().hostLecture(100, 500);
        double expected = 100;
        Student ericB = Students.getInstance().findByID(23);
        double actual = ericB.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.01);
    }

}
