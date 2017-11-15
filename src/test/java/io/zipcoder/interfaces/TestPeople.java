package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class TestPeople {
    Student student1 = new Student (1,"Raul");
    Student student2 = new Student(2,"Greg");
    ArrayList<Person> personList = new ArrayList<Person>();

    @Test

    public void testAdd() {
        //:Given
        personList.add(student1);
        personList.add(student2);
        int expected = 2;



        int actual = personList.size();


        Assert.assertEquals(expected, actual);


    }

    @Test

    public void testRemove() {

        //: Given
        personList.add(student1);
        personList.add(student2);
        System.out.println(personList.size());
        int expected = 1;


        //: when


        personList.remove(student1);
        int actual = personList.size();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindById(){
        Students students = new Students();
        students.add(student1);
        students.add(student2);


        String expected = "Greg";

        String actual = students.findById(2).toString();

        Assert.assertEquals("The two names are the same", expected,actual);






    }

    @Test
    public void testremoveAll() {

        //: Given
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(student1);
        personList.add(student2);
        System.out.println(personList.size());

        int expected = 0;

        //: when

       personList.removeAll(personList);
       int actual = personList.size();
        Assert.assertEquals(expected, actual);

    }


}

