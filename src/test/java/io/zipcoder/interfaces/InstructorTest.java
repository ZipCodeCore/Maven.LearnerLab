package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
       Instructor implementationTest = new Instructor(89201944L);

        Class expected = Teacher.class;
        Class actual = implementationTest.getClass().getInterfaces()[0];

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Instructor inheritanceTest = new Instructor(89201944L);

        Class expected = Person.class;
        Class actual = inheritanceTest.getClass().getSuperclass();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach() {
        Instructor teachTest = new Instructor(89201944L);
        Student student = new Student(2);

        teachTest.teach(student, 12.0);
        double expected = 12;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }


    @Test
    public void testLecture() {
        Instructor teachLecture = new Instructor(89201944L);
        Student[] students = {new Student(1), new Student(2)};

    }

//        Instructor.lecture(learners, 20);
//        double expected = 10.0;
//
//        double actual = s1.getTotalStudyTime();
//
//        Assert.assertEquals(expected, actual, 0d);
//    }

}