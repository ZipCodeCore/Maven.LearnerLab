package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void ImplementationTest (){
        //Given
        Student studentTest = new Student(1209384353L);


        //When
        Class expected = Learner.class;
        Class actual = studentTest.getClass().getInterfaces()[0];

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InheritanceTest (){
        //Given
        Student studentTest = new Student(1209384353L);

        //When
        Class expected = Person.class;
        Class actual = studentTest.getClass().getSuperclass();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LearnTest(){
        //Given
        Student studentTest = new Student(1209384353L);
        double numberOfHours = 30.5;

        //When
        studentTest.learn(numberOfHours);

        double expected = 30.5;
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .5);

    }
}
