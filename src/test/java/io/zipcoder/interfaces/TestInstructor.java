package io.zipcoder.interfaces;
import org.junit.*;


public class TestInstructor {
    Instructor newInstructor = new Instructor(7779311, "Becky");
    Student newLearner = new Student(12345, "Biff");

    @Test
    public void testImplementation(){
    boolean instructorIsTeacher;


        if (newInstructor instanceof Teacher){
            instructorIsTeacher = true;
    } else {
            instructorIsTeacher = false;
    }
        Assert.assertTrue(instructorIsTeacher);
    }

    @Test
    public void testInheritance(){
        boolean instructorIsPerson;
         if (newInstructor instanceof Teacher){
            instructorIsPerson = true;
        } else {
            instructorIsPerson = false;
        }
        Assert.assertTrue(instructorIsPerson);
    }

    @Test
    public void testLearn(){
        newInstructor.teach(newLearner,20);
        double expected = 20;
        double actual = newLearner.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);


    }

    @Test
    public void testLecture() {
        newInstructor.teach(newLearner,15);
        double expected = 15;
        double actual = newLearner.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);

    }

}