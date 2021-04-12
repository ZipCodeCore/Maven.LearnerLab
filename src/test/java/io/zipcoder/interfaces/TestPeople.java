package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    @Before
    public void setUp() {

    }

    @Test
    public void addTest() {
        Students classroom = Students.getInstance();
        Student student = new Student(55,"Bibby");
        Student student1 = new Student(15, "Red");
        Student student2= new Student(16,"Blue");
        classroom.addPerson(student);
        classroom.addPerson(student1);
        classroom.addPerson(student2);
        int actual = classroom.count();
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeTest() {

        Students classroom = Students.getInstance();
        classroom.removePerson(classroom.toArray()[1]);
        int actual = classroom.count();
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        Students classroom = Students.getInstance();

        Person expected = classroom.findById(55L);
        Person actual = classroom.personList.get(3);

        Assert.assertEquals(actual, expected);

    }

}
