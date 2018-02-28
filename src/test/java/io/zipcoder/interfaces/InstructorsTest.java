package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void test() {

        Instructors instance1 = Instructors.getInstance();



        instance1.add(new Instructor(1));
        instance1.add(new Instructor(2));
        instance1.add(new Instructor(3));
        instance1.add(new Instructor(4));
        instance1.add(new Instructor(5));
        instance1.add(new Instructor(6));
        instance1.add(new Instructor(7));

        instance1.findById(1).setName("Tariq");
        instance1.findById(2).setName("Frolian");
        instance1.findById(3).setName("Leon");
        instance1.findById(4).setName("Nu");
        instance1.findById(5).setName("Kris");
        instance1.findById(6).setName("Willhelm");
        instance1.findById(7).setName("Dulio");


        Assert.assertSame(instance1,instance1);
        Assert.assertEquals(instance1.findById(1).getName(), instance1.findById(1).getName());
        Assert.assertEquals(instance1.findById(2).getName(), instance1.findById(2).getName());
        Assert.assertEquals(instance1.findById(3).getName(), instance1.findById(3).getName());
        Assert.assertEquals(instance1.findById(4).getName(), instance1.findById(4).getName());
        Assert.assertEquals(instance1.findById(5).getName(), instance1.findById(5).getName());
        Assert.assertEquals(instance1.findById(6).getName(), instance1.findById(6).getName());
        Assert.assertEquals(instance1.findById(7).getName(), instance1.findById(7).getName());




    }
}