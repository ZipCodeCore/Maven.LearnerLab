package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
Educator leon = Educator.LEON;
        Assert.assertTrue(leon instanceof Teacher);
    }

    @Test
    public void testTeach(){
Educator leon = Educator.LEON;
Students ff = Students.getInstance();
Student jen = ff.findById(8383);

leon.teach(jen, 4.0);
Double expected = 4.0;
//Double expected = jen.totalStudyTime;  // also works, idk y
Double actual = jen.getTotalStudyTime();

Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture(){
        Educator leon = Educator.LEON;
        Students ff = Students.getInstance();
        Student jen = ff.findById(8383);

        leon.lecture(ff.toArray(), 3.0);
        Double expected = 3.0;
        Double actual = ff.findById(4242).totalStudyTime;

        Assert.assertEquals(expected, actual);

    }


}
