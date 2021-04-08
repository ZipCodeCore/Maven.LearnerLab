package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
            //Given
            Student studentTest= new Student(1209384353L);


            //When
            Class expected = Learner.class;
            Class actual = studentTest.getClass().getInterfaces()[0];

            //Then
            Assert.assertEquals(expected, actual);
        }


    @Test
    public void testInheritance(){
        //Given
        Student studentTest= new Student(1209384353L);

        //When
        Class expected = Person.class;
        Class actual = studentTest.getClass().getSuperclass();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
        //Given
        Student studentTest = new Student(1209384353L);
        studentTest.learn(22);
        //When
        double expected = 22;
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

}