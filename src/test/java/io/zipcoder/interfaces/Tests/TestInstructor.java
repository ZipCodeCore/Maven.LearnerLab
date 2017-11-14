package io.zipcoder.interfaces.Tests;

import io.zipcoder.interfaces.classes.Instructor;
import io.zipcoder.interfaces.classes.Instructors;
import io.zipcoder.interfaces.classes.Person;
import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.interfaces.Learner;
import io.zipcoder.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestInstructor {

    Instructor testInstructor = new Instructor(1);
    Student testStudentOne = new Student(1);
    Student testStudentTwo = new Student(2);
    private Learner[] students = {testStudentOne, testStudentTwo};

    @Test
    public void testImplementation() {

        boolean expected = true;
        boolean actual = testInstructor instanceof Teacher;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        boolean expected = true;
        boolean actual = testInstructor instanceof Person;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach() {

        double expected = 20;
        testInstructor.teach(testStudentOne, expected);
        double actual = testStudentOne.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {

        double expected = 5;
        //2 students 10/2=5
        testInstructor.lecture(students, 10);

        double actual = testStudentOne.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGetArray() {

        int expected = 3;
        int actual = Instructors.getInstance().getArray().size();

        Assert.assertEquals(expected, actual);
    }
}
