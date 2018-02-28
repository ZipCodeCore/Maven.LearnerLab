package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStudents {
    @Test
    public void test() {
        Students instance1 = Students.getInstance();
        Students instance2 = Students.getInstance();

        Student student1 = new Student(32401298);
        Student student2 = new Student(22324329);
        Student student3 = new Student(98722112);
        Student student4 = new Student(23424542);
        Student student5 = new Student(32442346);
        Student student6 = new Student(35566742);

        instance1.add(student1);
        instance1.add(student2);
        instance1.add(student3);
        instance2.add(student4);
        instance2.add(student5);
        instance2.add(student6);

        Students expected = instance2;
        Students actual = instance1;
        Assert.assertEquals(expected, actual);


    }
}
