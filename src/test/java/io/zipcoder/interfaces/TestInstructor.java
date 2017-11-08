package io.zipcoder.interfaces;
import org.junit.*;


public class TestInstructor {



    @Test
    public void testImplementation(){
    boolean instructorIsTeacher;
    Instructor newInstructor = new Instructor(7779311, "Becky");

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
        Instructor newInstructor = new Instructor(8675309, "Jenny");

        if (newInstructor instanceof Teacher){
            instructorIsPerson = true;
        } else {
            instructorIsPerson = false;
        }
        Assert.assertTrue(instructorIsPerson);
    }

    @Test
    public void testLearn(){
        Instructor newInstructor = new Instructor(12345, "Steve");
        Student newLearner = new Student(12345, "Biff");
        newInstructor.teach(newLearner,20);
        double expected = 20;
        double actual = newLearner.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);


    }

    @Test
    public void lecture() throws Exception {
    }

}