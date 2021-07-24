package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //given
        String name = "Mr. Feeney";
        Long id = 7463L;

        //when
        Object instructor = new Instructor(id, name);

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //given
        String name = "Mr. Feeney";
        Long id = 7463L;

        //when
        Object instructor = new Instructor(id, name);

        //then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //given
        String name = "Mr. Feeney";
        Long id = 7463L;
        Instructor teacher = new Instructor(id, name);
        Student student = new Student(555L , "Tim");
        Double hours = 3.5;

        //when
        teacher.teach(student, hours);
        Double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(hours, actual);

    }

    @Test
    public void testLecture(){
        //given
        String name = "Mr. Feeney";
        Long id = 7463L;
        Instructor teacher = new Instructor(id, name);
        Student student = new Student(555L , "Tim");
        Student student2 = new Student(552L , "Jim");
        Double hours = 10.0;
        Learner[] learners = {student, student2};

        //when
        teacher.lecture(learners, hours);
        Double actual = student.getTotalStudyTime();

        //then
        Double expected = 5.0;
        Assert.assertEquals(expected, actual);

    }
}
