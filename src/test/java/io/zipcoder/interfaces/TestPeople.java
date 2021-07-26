package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {



    @Test
    public void testAdd(){

        Students lo = Students.getInstance();
        Student uno = new Student(234, "martha");
        Student dos = new Student(567, "Liz");

        lo.add(uno);
        lo.add(dos);

        Assert.assertTrue(lo.contains(uno));
        Assert.assertTrue(lo.contains(dos));


    }

    @Test
    public void testRemove(){
        Students lo = Students.getInstance();
        Student uno = new Student(234, "martha");
        Student dos = new Student(567, "Liz");

        lo.add(uno);
        lo.add(dos);

        lo.remove(uno);
        lo.remove(dos);

        Assert.assertFalse(lo.contains(uno));
        Assert.assertFalse(lo.contains(dos));

    }

    @Test
    public void findById(){
        Students lo = Students.getInstance();
        Student uno = new Student(234,"mc&cheese");
        Student dos = new Student(567,"suga");

        lo.add(uno);
        lo.add(dos);

        int expected = 567;
        long actual = dos.getId();

        Assert.assertEquals(expected, actual);
    }



}
//        Person one1 = new Person(243282, "laura");
//        List<Person> personList = new ArrayList<>();
//        personList.add(one1);
//
////        People persona = new People();
////        List<People> peopleList = new ArrayList<>();
////        peopleList.add(persona);
//
//        int expected = 1;
//        //int actual = peopleList.size();
//        int actual2 = personList.size();
//
//        Assert.assertEquals(expected, actual2);









//        People people = new People();
//        People people2 = new People();
//        List<People> pepsList = new ArrayList<>();
//        pepsList.add(people);
//        pepsList.add(people2);
//
//        pepsList.remove(people);
//
//        int expected = 1;
//        int actual = pepsList.size();
//
//        Assert.assertEquals(expected, actual);