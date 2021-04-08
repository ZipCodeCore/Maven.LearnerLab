package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructorTest= new Instructor(1209384353L);


        //When
        Class expected = Teacher.class;
        Class actual = instructorTest.getClass().getInterfaces()[0];

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testInheritance(){
            //Given
            Instructor instructorTest= new Instructor(1209384353L);

            //When
            Class expected = Person.class;
            Class actual = instructorTest.getClass().getSuperclass();

            //Then
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void testTeach() {
        //Given
        Instructor instructorTest = new Instructor(2223232L);
        Student studentTest = new Student(2);

        //When
        instructorTest.teach(studentTest,222);
        double expected = 222;
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructorTest = new Instructor(22232322L);
        Student studentTest1 = new Student(556);
        Student studentTest2 = new Student(156);
        Student[] students = {studentTest1, studentTest2};

        //When
        instructorTest.lecture(students, 30);
        double expected = 15;
        double actual1 = students[0].getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual1, 0.01);
    }
}