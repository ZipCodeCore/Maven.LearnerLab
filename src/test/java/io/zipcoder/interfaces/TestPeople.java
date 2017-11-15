package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPeople{
    public class Fakepeople extends People<Person>{

        @Override
        public Person[] getArray() {
            return new Person[0];
        }
    }

    Person bob = new Person(3);
    Person jim = new Person(6);
    Fakepeople soManyPeople = new Fakepeople();

    @Test
    public void testAdd() {
        soManyPeople.add(bob);
        Person expected = bob;
        Person actual = soManyPeople.personList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemovePerson() {
        soManyPeople.add(bob);
        soManyPeople.add(jim);
        soManyPeople.remove(bob);
        Person expected = jim;
        Person actual = soManyPeople.personList.get(0);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveById() {
        soManyPeople.add(bob);
        soManyPeople.add(jim);
        soManyPeople.remove(3);
        Person expected = jim;
        Person actual = soManyPeople.personList.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById() {
        soManyPeople.add(bob);
        Person expected = bob;
        Person actual = soManyPeople.findById(3);
        Assert.assertEquals(expected, actual);
    }
}

