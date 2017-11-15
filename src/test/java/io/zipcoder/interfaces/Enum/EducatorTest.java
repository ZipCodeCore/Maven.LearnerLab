package io.zipcoder.interfaces.Enum;

import io.zipcoder.interfaces.classes.Instructor;
import io.zipcoder.interfaces.classes.Instructors;
import io.zipcoder.interfaces.classes.Person;
import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.interfaces.Learner;
import io.zipcoder.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    Educator testEducator = Educator.TARIQ;
    Student testStudentOne = new Student(1);
    Student testStudentTwo = new Student(2);
    private Learner[] students = {testStudentOne, testStudentTwo};

    @Test
    public void testImplementation() {

        boolean expected = true;
        boolean actual = testEducator instanceof Teacher;

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testInheritance() {
//        boolean expected = true;
//        boolean actual = testEducator instanceof Person;
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testTeach() {

        double expected = 20;
        testEducator.teach(testStudentOne, expected);
        double actual = testStudentOne.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {

        double expected = 5;
        //2 students 10/2=5
        testEducator.lecture(students, 10);

        double actual = testStudentOne.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGetArray() {

        int expected = 3;
        int actual = Instructors.getInstance().getArray().length;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetID(){
        long expected = 2;
        long actual = Educator.LEON.getId();

        Assert.assertEquals(expected,actual);

    }
}


