package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    People people = new People() {
        @Override
        public Person[] getArray() {
            return new Person[0];
        }
    };

    @Test
    public void testAdd(){
        Person person = new Student(0140);
        people.add(person);

        Assert.assertEquals(people.getCount(), 1);
    }

    @Test
    public void testRemove(){
        Person person = new Person(0140);
        Person person2 = new Person(0141);
        people.add(person);
        people.add(person2);
        people.remove(person);

        Assert.assertEquals(people.getCount(), 1);
    }

    @Test
    public void testRemoveById(){
        Person person = new Person(0140);
        Person person2 = new Person(0141);
        people.add(person);
        people.add(person2);
        people.removeById(person2.getId());

        Assert.assertEquals(people.getCount(), 1);
    }

    @Test
    public void testRemoveAll(){
        Person person = new Person(0140);
        Person person2 = new Person(0141);
        people.add(person);
        people.add(person2);
        people.removeAll();

        Assert.assertEquals(people.getCount(), 0);
    }

    @Test
    public void testFindById(){
        Person person = new Person(0140);
        Person person2 = new Person(0141);
        people.add(person);
        people.add(person2);

        Person found = people.findById(0140);

        Assert.assertEquals(found, person);
    }
}
