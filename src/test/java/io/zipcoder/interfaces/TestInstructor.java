package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(-1);


        //when
        //when I check the type of the instructor
        //then
        //then the type should be 'Teacher"
        Assert.assertTrue(instructor instanceof Teacher) ;
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(-1);

        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach(){
        Teacher teacher = new Instructor(-1);
        Student learner = new Student(-1);
        double numberOfHours = 72;

        teacher.teach(learner, numberOfHours);
        double actual = learner.getTotalStudyTime();

        Assert.assertEquals(numberOfHours, actual, 0);
    }
    @Test
    public void testLecture(){
        Teacher teacher = new Instructor(-1);
        Student student1 = new Student(-1);
        Student student2 = new Student(-2);
        Student student3 = new Student(-3);
        Student[] studentArray = new Student[]{student1, student2, student3};
        double numberOfHours = 15;
        double expected = 5;

        teacher.lecture(studentArray, numberOfHours);

        for (Student student : studentArray) {
            double actual = student.getTotalStudyTime();

            Assert.assertEquals(expected, actual, 0);
        }
    }

}


