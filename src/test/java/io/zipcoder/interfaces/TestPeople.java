package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    //ArrayList<Person> personList = new ArrayList<Person>();
    Students students = Students.getINSTANCE();

    @Test
    public void testAdd() {
        Student expected = new Student(15);
        students.add(expected);

        Assert.assertTrue(students.contains(expected));
    }

    @Test
    public void testFindById(){
        Student expected = new Student(15);
        students.add(expected);
        Person actual = students.findById(15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        Student expected = new Student(15);
        students.remove(expected);
        Assert.assertFalse(students.contains(expected));
    }

}
