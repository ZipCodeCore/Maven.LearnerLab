package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.FROILAN instanceof Teacher);
    }

    @Test
    public void addTest(){
        //Given
        Educator educator = Educator.FROILAN;
        //When
        int expected = 5;
        int actual = Instructors.getINSTANCE().getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void teach() {
        //Given
        Student Pax = new Student(3);
        Educator.FROILAN.teach(Pax, 4);
        //When
        double expected = 4;
        double actual = Pax.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void lecture() {
        //Given
        Student[] students = new Student[4];
        Student kay = new Student(1);
        Student bo = new Student(2);
        Student pax = new Student(3);
        Student joe = new Student(4);

        students[0] = kay;
        students[1] = bo;
        students[2] = pax;
        students[3] = joe;
        double numberOfHours = 16;


        Educator.FROILAN.lecture(students, 16);
        //When
        double expected = numberOfHours/students.length;
        double actual = pax.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }


    @Test
    public void getTimeWorked() {
        //Given
        Student[] students = new Student[4];
        Student kay = new Student(1);
        Student bo = new Student(2);
        Student pax = new Student(3);
        Student joe = new Student(4);

        students[0] = kay;
        students[1] = bo;
        students[2] = pax;
        students[3] = joe;

        double numberOfHours = 16;
        Educator.FROILAN.lecture(students, numberOfHours);

        //When
        double expected = numberOfHours;
        double actual = Educator.FROILAN.getTimeWorked();


        //Then
        Assert.assertEquals(expected, actual, 0.01);

    }
}