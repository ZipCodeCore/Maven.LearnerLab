package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void test(){
        //Given
        Instructors instance1 = Instructors.getInstance();
        Instructors instance2 = Instructors.getInstance();

        //When
        instance1.add(new Instructor(1L));
        instance2.add(new Instructor(2L));

        instance1.findById(1L).setName("Tariq");

        //Then
        Assert.assertEquals(instance1, instance2);
        Assert.assertEquals(instance1.findById(1L).getName(), instance2.findById(1L).getName());
    }

}