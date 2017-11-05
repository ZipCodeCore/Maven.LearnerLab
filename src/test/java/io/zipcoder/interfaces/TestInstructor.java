package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    long thisPesronId;
    Instructor instructor = new Instructor(0,"Tariq");
    @Test
    public void testImplementation(){
        //:given
        Teacher teacher;

        //;then

        Assert.assertTrue(instructor instanceof Teacher );

    }
@Test
    public void testTeach(){
        Student student = new Student(thisPesronId);
       double  expected = student.getTotalStudyTime() + 5;

      instructor.teach(student,5);
        double actual = student.getTotalStudyTime();


        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testInheritance(){
        //:given
        Person person = new Person(thisPesronId);

        //;then

        Assert.assertTrue(instructor instanceof Person );

    }

    @Test
    public void testLecture(){
        Student student = new Student(thisPesronId);
        Student student2 = new Student(thisPesronId);
        Learner[] learn = {student, student2};

        double  expected =  student.getTotalStudyTime() + 3;

        instructor.lecture(learn,6);


        double actual = student2.getTotalStudyTime();


        Assert.assertEquals(expected, actual, 0);

    }

}