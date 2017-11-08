package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    long thisPesronId;
    Instructor instructor = new Instructor(0,"Tariq");
    Students students = Students.getInstance();
    @Test
    public void testImplementation(){
        //:given
        Teacher teacher;

        //;then

        Assert.assertTrue(instructor instanceof Teacher );

    }
@Test
    public void testTeach(){

       double  expected = students.getArray()[1].getTotalStudyTime() + 5;

      instructor.teach(students.getArray()[1],5);
        double actual = students.getArray()[1].getTotalStudyTime();


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

        double  expected =  students.getArray()[1].getTotalStudyTime() + 2;

        instructor.lecture(students.getArray(),54);


        double actual = students.getArray()[1].getTotalStudyTime();


        Assert.assertEquals(expected, actual, 0);

    }

}