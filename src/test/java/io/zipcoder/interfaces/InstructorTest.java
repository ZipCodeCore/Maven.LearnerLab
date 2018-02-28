package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    public Instructor instructorTest;

//    Create a TestInstructor class.
//    Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
//    Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
//    Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
//    Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
//

    @Before
   public void setup(){

    }
    @Test
    public void testImplementation(){
        Instructor anInstructor = new Instructor("Kris",100);
        Assert.assertTrue(anInstructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor anInstructor = new Instructor("Kris",100);
        Assert.assertTrue(anInstructor instanceof Person);
    }
    @Test
    public void testTeach() {
        Student aStudent =new Student("Kibret",1,400.0);
        instructorTest = new Instructor("Kris",100);
        instructorTest.teach(aStudent,100.0);
        double expected = 500.0;
        double actual =aStudent.getTotalStudyTime() ;

        Assert.assertEquals(expected,actual,0.01);


    }
//Having difficulty understanding what is expected of this test
    @Test
    public void lecture() {
        instructorTest = new Instructor("Kris",10);
        Student firstStudent =new Student("John",1,50);
        Student secondStudent = new Student("Mathew",2,0);
        Learner[] learners ={firstStudent,secondStudent};

        instructorTest.lecture(learners,600.0);

        double expected = 350.0;
        firstStudent.totalStudyTime+=instructorTest.getNumberOfHoursPerLearner();
        double actual = firstStudent.totalStudyTime;


        Assert.assertEquals(expected,actual,0.01);



    }
}