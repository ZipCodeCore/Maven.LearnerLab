package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class PeopleTest {
    People people = new People();
    Person Andrea = new Person(1, "");
    Person Lina = new Person(2, "");

    @Test
    public void testAdd(){
        people.add(Andrea);
        Person expected = Andrea;
        Person actual = People.personList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        people.add(Andrea);
        people.add(Lina);
        people.remove(Andrea);
        Person expected = Lina;
        Person actual = People.personList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindByID(){
        people.add(Andrea);
        Person expected = Andrea;
        Person actual = people.findByID(1);
        Assert.assertEquals(expected, actual);
    }
}