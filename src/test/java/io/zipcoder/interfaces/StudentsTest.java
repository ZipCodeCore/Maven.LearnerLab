package io.zipcoder.interfaces;

import com.sun.deploy.association.AssociationService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void test(){

        Students instance1 = Students.getInstance();
        Students instance2 = Students.getInstance();


        instance1.add(new Student(1));
        instance2.add(new Student(2));
        instance1.add(new Student(3));
        instance2.add(new Student(4));

        instance1.findById(1).setName("yolo");

        Assert.assertSame(instance1, instance2);
        Assert.assertSame(instance1.findById(1), instance2.findById(1));
        Assert.assertEquals(instance1.findById(1).getName(), instance2.findById(1).getName());
        Assert.assertEquals(instance1.getCount(), 4);
        Assert.assertEquals(instance2.getCount(), 4);


    }

}