package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        //Given
            //that i have a student
            Student student = new Student(-1);

        //When
        //Thenm(they are together here)
            //Assert that this is true
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(-1);

        //When
        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(-1);
        double expected = 5; //hours that we added

        //When
        student.learn(5);
        double actual = student.getTotalStudyTime();

        //Then
            Assert.assertEquals(expected,actual,0);

    }
}
