package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Instructor bob = new Instructor("Katrina", 12234);
        Assert.assertTrue(bob instanceof ITeacher);
    }
    @Test
    public void testInheritance() {
        Instructor bob = new Instructor("Katrina", 12234);
        Assert.assertTrue(bob instanceof Person);
    }
        @Test
    public void teach() {
        Student aStudent = new Student("katrina", 123, 200);
        Instructor aInstructor = new Instructor("Chris", 12);
        aInstructor.teach(aStudent, 100);
        double expected = 300.0;
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual ,.01);
        //how much error you want due to double

    }

   /** @Test  Having difficulty with making this test without having the array available.
    public void lecture() {
        Learner[] student= new Learner[2];
        Instructor aInstructor = new Instructor("Chris", 12);
        Student aStudent1 = new Student("Chris", 123, 50);
        Student aStudent2 = new Student("Lamar", 124, 0);
        student[0] = aStudent1;
        student[1] = aStudent2;
        aInstructor.lecture(student, 100);
        double expected = 50.00;
        double actual = aStudent1.getTotalStudyTime();
        Assert.assertEquals(expected,actual ,.01);

    }*/
}

/**Part 5.0 - Test Instructor

        Create a TestInstructor class.
        Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
        Create a testInheritance method that asserts that a Instructor is an instanceof a Person.

        Create a testTeach method that ensures when an Instructor invokes the teach method, a
 respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
        Create a testLecture method that ensures when an Instructor invokes the lecture method, a
 respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.*/
/**Instructor
public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);*/
