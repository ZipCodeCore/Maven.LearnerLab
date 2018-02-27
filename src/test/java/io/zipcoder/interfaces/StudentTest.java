package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void inheritanceTest() {
        //Given
        Student stinkyPete = new Student(69);

        //When
        Class expected = Person.class;
        Class actual = stinkyPete.getClass().getSuperclass();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void implementationTest(){
        //Given
        Student stinkyPete = new Student(69);

        //When
        Class expected = Learner.class;
        Class actual = stinkyPete.getClass().getInterfaces()[0];

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void learnTest(){
        //Given
        Student stinkyPete = new Student(69);

        //When
        stinkyPete.learn(100);
        double expected = 100;
        double actual = stinkyPete.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.01);

    }


}
