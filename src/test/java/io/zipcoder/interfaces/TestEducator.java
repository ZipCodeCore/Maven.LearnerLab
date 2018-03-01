package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.TARIQ instanceof Teacher);
    }

    @Test
    public void addTest(){
        //Given
        Educator educator = Educator.FROILAN;

        //When
        int expected = 6;
        int actual = Instructors.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void teachTest(){
        //Given
        Student gary = new Student(555);

        Educator.WILHEM.teach(gary, 20);

        //When
        double expected = 20;
        double actual = gary.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void lectureTest(){
        //Given
        Student[] students = new Student[2];
        Student gary = new Student(555);
        Student phil = new Student(666);
        students[0] = gary;
        students[1] = phil;

        Educator.STEVE.lecture(students, 20);

        //When
        double expected = 10;
        double actual = gary.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getTimeWorkedTest(){
        //Given
        Student[] students = new Student[2];
        Student gary = new Student(555);
        Student phil = new Student(666);
        students[0] = gary;
        students[1] = phil;
        Educator.TARIQ.lecture(students, 25);

        //When
        double actual = Educator.TARIQ.getTimeWorked();
        double expected = 25;

        //Then
        Assert.assertEquals(expected, actual, 0.01);

    }
}
