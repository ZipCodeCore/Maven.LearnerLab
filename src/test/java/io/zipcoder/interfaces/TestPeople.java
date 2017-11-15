package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        Students students = Students.getInstance();

        Student person1 = new Student(121, "Lina",4.0);
        students.add(person1);
        Student actual = students.findById(121);
        //System.out.println(person1);
        Assert.assertEquals(person1, students.findById(121));
    }

    @Test
    public void testRemove() {
        Students students = Students.getInstance();

        Student person1 = new Student(14, "Merin",4.0);
        students.add(person1);
        students.remove(person1);
        Assert.assertFalse(students.personList.contains(person1));
    }

    @Test
    public void testRemoveId() {
        //People people = new People();
        Students students = Students.getInstance();

        Student person2 = new Student(13, "Tom",1.0);
        students.add(person2);
        students.remove(13);
        Assert.assertFalse(students.personList.contains(person2));
    }

    @Test
    public void testFindId() {
        //People people = new People();
        Students students = Students.getInstance();

        Student person3 = new Student(123, "Jerry",12.0);
        students.add(person3);
        Student expected = person3;
        Student actual = students.findById(person3.getId());
        Assert.assertEquals(expected, actual);

    }
//    public void getCountTest(){
//
//    }
}
