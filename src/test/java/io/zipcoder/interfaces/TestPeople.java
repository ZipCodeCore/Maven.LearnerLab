package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    People peopleObject;
    Person person;
    Person person2;
    Person person3;


    @Before
    public void testContr(){
        peopleObject = new People() {
            public Person[] toArray() {
                return new Person[0];
            }
        };
        person = new Person(11, "Zan");
        person2 = new Person(01, "Johnny");
        person3 = new Person(02, "Elliot");
    }

    @Test
    public void testAdd(){
        peopleObject.add(person);

        Integer expected = 1;
        Integer actual = peopleObject.personList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        peopleObject.add(person2);
        peopleObject.add(person3);
        peopleObject.remove(person2);

        Integer expected = 1;
        Integer actual = peopleObject.personList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        peopleObject.add(person2);


        Person expected = person2;
        Person actualId = peopleObject.findById(1);

        Assert.assertEquals(expected.getId(),actualId.getId());
    }

}
