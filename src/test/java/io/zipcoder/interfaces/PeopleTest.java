package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;


public class PeopleTest {

    private Students students;
    private Student student1;
    private Student student2;
    private Student student3;

    @Before
    public void setUp() throws Exception {
        // people = new People();
        this.students = Students.getInstance();
        student1 = new Student(7, "Val");
        student2 = new Student(14, "Charlotte");
        student3 = new Student(19, "Chung");
    }
        
    @Test
    public void addTest() {
        Assert.assertEquals(7, students.count());
        students.add(student1);
        Assert.assertEquals(8, students.count());
    }

    @Test
    public void findByIdTest() {
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Assert.assertEquals(student3, students.findById(19));
    }

    @Test
    public void removeTest() {
        students.add(student1);
        students.add(student2);
        Assert.assertEquals(10, students.count());
        Assert.assertTrue(students.contains(student1));
        students.remove(student1);
        Assert.assertEquals(9, students.count());
        Assert.assertFalse(students.contains(student1));
    }


}