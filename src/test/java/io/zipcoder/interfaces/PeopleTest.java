package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    private People people;
    private Person person;

    // People is now an abstract class, so need to create a subclass of People for testing
    // and need to override the abstract method getArray() in class People
    public class TestPeople extends People {
        @Override
        public Person[] getArray() {
            return new Person[0];
        }
    }

    @Test
    public void addTest() {
        // Given
        int expectedPersonListSize = 1;
        long expectedIdPerson0 = 0L;
        String expectedNamePerson0 = "person0";
        Person person0 = new Person(expectedIdPerson0, expectedNamePerson0);
        // When
        people = new TestPeople();
        people.add(person0);
        int actualPersonListSize = people.getCount();
        // Then
        Assert.assertEquals(expectedPersonListSize, actualPersonListSize);
    }

    @Test
    public void removeByPersonTest() {
        int expectedPersonListSize = 0;
        long expectedIdPerson0 = 0L;
        String expectedNamePerson0 = "person0";
        Person person0 = new Person(expectedIdPerson0, expectedNamePerson0);
        // When
        people = new TestPeople();
        people.add(person0);
        people.removeByPerson(person0);
        int actualPersonListSize = people.getCount();
        // Then
        Assert.assertEquals(expectedPersonListSize, actualPersonListSize);
    }

    @Test
    public void findByIdTest() {
        long expectedIdPerson0 = 0L;
        String expectedNamePerson0 = "person0";
        Person person0 = new Person(expectedIdPerson0, expectedNamePerson0);
        // When
        people = new TestPeople();
        people.add(person0);
        String actualNamePerson0 = people.findById(expectedIdPerson0).getName();
        // Then
        Assert.assertEquals(expectedNamePerson0, actualNamePerson0);
    }

}
