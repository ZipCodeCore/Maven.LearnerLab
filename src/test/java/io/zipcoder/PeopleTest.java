package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PeopleTest {

    Person bill;
    Person carol;
    Person geoff;
    Person sarah;

    public class TestPeople extends People{
        @Override
        public Person[] getArray() {
            return new Person[0];
        }
    }

    TestPeople test;

    @Before
    public void setup(){
        test = new TestPeople();
        bill = new Person();
        carol = new Person("carol", 1234);
        geoff = new Person();
        sarah = new Person();
        test.personList.add(bill);
        test.personList.add(carol);
        test.personList.add(geoff);
    }

    @Test
    public void addTest(){
        test.add(sarah);
        Assert.assertEquals(test.personList.get(3), sarah);
    }

    @Test
    public void removeTest(){
        test.remove(carol);
        Assert.assertFalse(test.personList.contains(carol));
    }

    @Test
    public void findByIdTest(){
        Person actual = test.findById(1234);
        Assert.assertEquals(carol, actual);
    }

    @Test
    public void getSizeTest(){
        int expected = 3;
        int actual = test.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest(){
        ArrayList<Person> expected = new ArrayList<>();
        test.removeAll();
        ArrayList<Person> actual = test.personList;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIDTest(){
        test.remove(1234);
        Assert.assertFalse(test.personList.contains(carol));
    }

}
