package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    @Test
    public void testAdd() {
        People people = new People();
        Person person1 = new Person(12, "Lina");
        people.add(person1);
        Person expected = person1;
        Person actual = people.personList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person person1 = new Person(12, "Lina");
        people.add(person1);
        people.remove(person1);
        Assert.assertFalse(people.personList.contains(person1));
    }

    @Test
    public void testRemoveId() {
        People people = new People();
        Person person2 = new Person(13, "Tom");
        people.add(person2);
        people.remove(13);
        //  Assert.assertFalse(people.personList.contains(person2));
    }

    @Test
    public void testFindId() {
        People people = new People();
        Person person3 = new Person(14, "Jerry");
        people.add(person3);
        Person expected = person3;
        Person actual = people.findById(person3.getId());
        Assert.assertEquals(expected, actual);

    }
//    public void getCountTest(){
//
//    }
}
