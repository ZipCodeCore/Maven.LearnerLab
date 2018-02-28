package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void test() {

        Instructors instance1 = Instructors.getInstance();
        Instructors instance2 = Instructors.getInstance();
        Instructors instance3 = Instructors.getInstance();
        Instructors instance4 = Instructors.getInstance();
        Instructors instance5 = Instructors.getInstance();
        Instructors instance6 = Instructors.getInstance();
        Instructors instance7 = Instructors.getInstance();


        instance1.add(new Instructor(1));
        instance2.add(new Instructor(2));
        instance3.add(new Instructor(3));
        instance4.add(new Instructor(4));
        instance5.add(new Instructor(5));
        instance6.add(new Instructor(6));
        instance7.add(new Instructor(7));

        instance1.findById(1).setName("Tariq");
        instance2.findById(2).setName("Frolian");
        instance3.findById(3).setName("Leon");
        instance4.findById(4).setName("Nu");
        instance5.findById(5).setName("Kris");
        instance6.findById(6).setName("Willhelm");
        instance7.findById(7).setName("Dulio");


        Assert.assertSame(instance1,instance2);
        Assert.assertEquals(instance1.findById(1).getName(), instance2.findById(1).getName());
        Assert.assertEquals(instance1.findById(2).getName(), instance2.findById(2).getName());
        Assert.assertEquals(instance1.findById(3).getName(), instance2.findById(3).getName());
        Assert.assertEquals(instance1.findById(4).getName(), instance2.findById(4).getName());
        Assert.assertEquals(instance1.findById(5).getName(), instance2.findById(5).getName());
        Assert.assertEquals(instance1.findById(6).getName(), instance2.findById(6).getName());
        Assert.assertEquals(instance1.findById(7).getName(), instance2.findById(7).getName());




    }
}