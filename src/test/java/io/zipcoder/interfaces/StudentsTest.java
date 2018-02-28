package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {


    @Test
    public void ensureAllStudentsInSingleton() {
        //Given
        Students instance = Students.getINSTANCE();
        Students instance1 = Students.getINSTANCE();
        //When
        instance.add(new Student(123));
        instance.add(new Student(122));
        instance1.add(new Student(124));
        instance1.add(new Student(125));
        //Then
        Assert.assertEquals(instance, instance1);
    }

}