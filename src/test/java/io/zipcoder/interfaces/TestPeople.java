package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void addTest(){
        People newPeople = new People();
        Person personOne = new Person(398429847L, "Brian");

        int expectedPeeps = 1;
        newPeople.add(personOne);
        int actualPeeps = newPeople.count();

        Assert.assertEquals(expectedPeeps, actualPeeps);
    }

    @Test
    public void removebyIDTest(){
        People newPeople = new People();
        Person personOne = new Person(398429847L, "Brian");
        Person personTwo = new Person(242487613L, "Mike");

        int expectedPeeps = 1;
        newPeople.add(personOne);
        newPeople.add(personTwo);
        newPeople.removeById(242487613L);
        int actualPeeps = newPeople.count();

        Assert.assertEquals(expectedPeeps, actualPeeps);
    }

    @Test
    public void removeAllTest(){
        People newPeople = new People();
        Person personOne = new Person(398429847L, "Brian");
        Person personTwo = new Person(242487613L, "Mike");

        int expectedPeeps = 0;
        newPeople.add(personOne);
        newPeople.add(personTwo);
        newPeople.removeAll();
        int actualPeeps = newPeople.count();

        Assert.assertEquals(expectedPeeps, actualPeeps);
    }


    @Test
    public void findByIdTest(){
        People newPeople = new People();
        Person personOne = new Person(398429847L, "Brian");

        long expectedPersonById = 398429847L;
        newPeople.add(personOne);
        long actualPersonById = personOne.getId();

        Assert.assertEquals(expectedPersonById, actualPersonById);
    }

}
