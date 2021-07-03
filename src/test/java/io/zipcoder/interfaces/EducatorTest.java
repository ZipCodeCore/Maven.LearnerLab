package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    //test passes if run independently but fails if run as part of the suite due to static nature
    //of the Students singleton
    @Test
    public void teachTest(){
        //Given
        ZipCodeWilmington.getInstance();

        //When
        Educator.LEON.teach(Students.getInstance().findByID(23),100);
        double expected = 100;
        double actual = Students.getInstance().findByID(23).getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void lectureTest(){
        //Given
        ZipCodeWilmington.getInstance();

        //When
        Educator.LEON.lecture(Students.getInstance().getArray(),500);
        double expected = 100;
        double actual = Students.getInstance().findByID(70).getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void timeWorkedTest(){
        //Given
        ZipCodeWilmington.getInstance();

        //When
        Educator.LEON.lecture(Students.getInstance().getArray(),500);
        double expected = 500;
        double actual = Educator.LEON.timeWorked;

        //Then
        Assert.assertEquals(expected,actual,0.01);
    }


}
