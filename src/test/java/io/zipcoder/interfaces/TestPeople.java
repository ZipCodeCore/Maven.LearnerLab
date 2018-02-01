package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TestPeople {

    @Before
    public void clearLists(){
        Students students = Students.getInstance();
        students.removeAll();
        Instructors instructors = Instructors.getInstance();
        instructors.removeAll();

    }

    @Test
    public void testAdd(){
        Students people = Students.getInstance();


        for (int i=0; i<5; i++) {
            Student person = new Student();
            people.add(person);
        }
        Assert.assertEquals(5, people.getCount());
    }

    @Test
    public void testRemove(){
        Students people = Students.getInstance();
        Student person = new Student();
        for (int i=0; i<5; i++) {
            person = new Student();
            people.add(person);
        }
        people.remove(person);

        Assert.assertEquals(4, people.getCount());
    }

    @Test
    public void testFindById(){
        Students people = Students.getInstance();
        Student tim = new Student(21907522,"tim");
        people.add(tim);

        Student person;
        for (int i=0; i<5; i++) {
            person = new Student();
            people.add(person);
        }

        person=people.findById(tim.getId());

        Assert.assertEquals(tim.getId(), person.getId(), 0.1);
    }

}
