package io.zipcoder.interfaces;
import io.zipcoder.interfaces.Class.Person;
import io.zipcoder.interfaces.Class.Student;
import io.zipcoder.interfaces.Class.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople{

    //Student students = new Students();
    Students students = new Students();
    Student person = new Student(123);
    @Test
    public void testAdd(){

        students.add(person);

        long expected = 123;

        long actual = students.findById(123).getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){


        long expected1 = 123;
        Student expected2 = null;

        students.add(person);
        long actual1 = students.findById(123).getId();
        students.remove(person);
        Student actual2 = students.findById(123);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);

    }

    @Test
    public void testFindById(){
        Person expected =person;
        students.add(person);
        Person actual = students.findById(123);
        Assert.assertEquals(expected,actual);
    }

}
