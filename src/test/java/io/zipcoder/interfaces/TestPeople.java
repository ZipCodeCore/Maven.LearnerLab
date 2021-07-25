package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {



    @Test
    public void testAdd(){

        Person one1 = new Person(243282, "laura");
        List<Person> personList = new ArrayList<>();
        personList.add(one1);

//        People persona = new People();
//        List<People> peopleList = new ArrayList<>();
//        peopleList.add(persona);

        int expected = 1;
        //int actual = peopleList.size();
        int actual2 = personList.size();

        Assert.assertEquals(expected, actual2);

    }

    @Test
    public void testRemove(){

        People people = new People();
        People people2 = new People();
        List<People> pepsList = new ArrayList<>();
        pepsList.add(people);
        pepsList.add(people2);

        pepsList.remove(people);

        int expected = 1;
        int actual = pepsList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findById(){

        Person person = new Person(234,"mc&cheese");
        Person personO = new Person(567,"suga");
        List<Person> personList = new ArrayList<>();
        personList.add(personO);
        personList.add(person);

        int expected = 567;
        long actual = personO.getId();

        Assert.assertEquals(expected, actual);
    }



}
