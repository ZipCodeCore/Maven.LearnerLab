package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PeopleTest {

    @Test
    public void addTest() {
        Student student = new Student(34L,"Gau");
        Student student2 = new Student(45L,"Cyan");
        Students students = Students.getInstance();

        students.add(student);
        students.add(student2);
        Assert.assertTrue(students.contains(student));
    }

    @Test
    public void addTest2() {
        Student student = new Student(34L,"Gau");
        Student student2 = new Student(45L,"Cyan");
        Students students = Students.getInstance();

        students.add(student);
        students.add(student2);
        Assert.assertEquals(6,students.personList.size());
    }

    @Test
    public void findByID() {
        Long id = 34L;
        String expected = "Gau";
        Person person = new Person(id,expected);
        Students students = Students.getInstance();

        String actual = students.findByID(id).getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        Instructor instructor = new Instructor(null,null);
        Instructors instructors = Instructors.getInstance();
        instructors.add(instructor);
        instructors.remove(instructor);

        Assert.assertFalse(instructors.contains(instructor));
    }

    @After
    public void clearInstance(){
        Students students = Students.getInstance();
        for(int i = 4; i < students.personList.size(); i++){
            students.personList.remove(i);
        }
    }
}