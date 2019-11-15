package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;


public class PeopleTest {

    private People people;
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void setUp() throws Exception {
        people = new People();
        person1 = new Person(17, "Charlotte");
        person2 = new Person(44, "Val");
        person3 = new Person(75, "Malcolm");
    }

    @Test
    public void addTest() {
        Assert.assertEquals(0, people.count());
        people.add(person1);
        Assert.assertEquals(1, people.count());
    }

    @Test
    public void findByIdTest() {
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Assert.assertEquals(person2, people.findById(44));
    }

    @Test
    public void removeTest() {
        people.add(person1);
        people.add(person2);
        Assert.assertEquals(2, people.count());
        Assert.assertTrue(people.contains(person1));
        people.remove(person1);
        Assert.assertEquals(1, people.count());
        Assert.assertFalse(people.contains(person1));
    }


}