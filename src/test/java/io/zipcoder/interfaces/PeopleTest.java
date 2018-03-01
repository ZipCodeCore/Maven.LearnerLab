package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {

  ConcreteImplementation people = new ConcreteImplementation();
    @Test
    public void remove1() {
        Person Richard = new Person("Richard",120);
        people.personList.add(Richard);
        Person Mathew = new Person("Mathew",121);
        people.personList.add(Mathew);

        people.personList.remove(Mathew);

        int expected = 1;
        int actual = people.personList.size();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestAdd(){
        Person Vince = new Person("Vince",150);
        people.personList.add(Vince);
        Person Owen = new Person("Owen",151);
        people.personList.add(Owen);

        int expected =2;
        int actual = people.personList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestFindById(){
        Person Joe = new Person("Joe",150);
        people.personList.add(Joe);
        Person Jess = new Person("Jess",151);
        people.personList.add(Jess);

        Person expected = Joe;
        Person actual = people.findById(150);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getCount() {
    }

    @Test
    public void getArray() {
    }

    @Test
    public void removeAll() {
    }
}