package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator=Educator.KRIS;
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach(){
        //given
        Learner dipinti=new Student(5l,"dipinti");
        Educator educator=Educator.DOLIO;
        double expectedValue=2.0;
        //when
        educator.teach(dipinti,expectedValue);
        double actualValue=educator.getTimeWorked();
        //then
        Assert.assertEquals(expectedValue,actualValue,0.0);
    }

    @Test
    public void testLecture(){
        //given
        Students students=Students.getInstance();
        Educator educator=Educator.KRIS;
        int numberOfStudents=students.personList.size();
        double expectedValue=25/numberOfStudents;
        //when
        educator.lecture(students.getArray(),25);
        double actualValue=educator.getTimeWorked();
        //then
        Assert.assertEquals(expectedValue,actualValue,0.0);
    }
}
