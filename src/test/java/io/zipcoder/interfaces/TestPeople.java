package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPeople {

    @Test
    public void addPersonTest() {
        People people = new People();
        Person person1 = new Person(12);
        person1.setName("Bob");
        people.addPerson(person1);

        String expected = "[Bob: 12]";
        String actual = Arrays.toString(people.getArray());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonTest() {
        People people = new People();
        List<Person> testPersonList = new ArrayList<Person>();
        Person person1 = new Person(12);
        Person person2 = new Person(13);
        Person person3 = new Person(14);

        person1.setName("Bob");
        person2.setName("Sally");
        person3.setName("Max");

        people.addPerson(person1);
        people.addPerson(person2);
        people.addPerson(person3);

        people.remove(person1);

        Person[] expected = {person2, person3};
        Person[] actual = people.getArray();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {
        People people = new People();
        Person person1 = new Person(12);
        Person person2 = new Person(15);
        person1.setName("Sue");
        person2.setName("Max");

        people.addPerson(person1);
        people.addPerson(person2);

        Person expected = person1;
        Person actual = people.findById(12);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        People people = new People();
        Person person1 = new Person(12);
        Person person2 = new Person(15);
        person1.setName("Sue");
        person2.setName("Max");

        people.addPerson(person1);
        people.addPerson(person2);

        people.remove(12);

        Person[] expected = {person2};
        Person[] actual = people.getArray();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {
        People people = new People();
        Person person1 = new Person(12);
        Person person2 = new Person(15);
        person1.setName("Sue");
        person2.setName("Max");

        people.addPerson(person1);
        people.addPerson(person2);

        int expected = 2;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest() {
        People people = new People();
        Person person1 = new Person(12);
        Person person2 = new Person(15);
        person1.setName("Sue");
        person2.setName("Max");

        people.addPerson(person1);
        people.addPerson(person2);

        people.removeAll();

        int expected = 0;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }
}
