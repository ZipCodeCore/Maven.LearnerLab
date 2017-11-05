package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class TestPeople {
    Student student1 = new Student(1,"Raul");
    Student student2 = new Student(1,"Greg");


    @Test

    public void testAdd() {

        //: Given
        ArrayList<Person> personList = new ArrayList<Person>();
        int expected = 2;


        //: when
        System.out.println(personList.size());
        personList.add(student1);
        personList.add(student2);

        int actual = personList.size();


        Assert.assertEquals(expected, actual);


    }

    @Test

    public void testRemove() {

        //: Given
        ArrayList<Person> personList = new ArrayList<Person>();
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

