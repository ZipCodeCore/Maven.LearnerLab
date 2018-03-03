package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class PeopleTest {
     ArrayList<Person> personList = new ArrayList<>();

    @Test
    public void addPersonTest(){
        //Given
        People people = new People();
        Person person1 = new Person(765);
        //When
        people.addPerson(person1);
        boolean personHasBeenAdded = (people.getCountOfList() == 1);
        //Then
        Assert.assertTrue(personHasBeenAdded);
    }
    @Test
    public void removePersonByIdTest(){
        //Given
        People people = new People();
        Person person1 = new Person(634);
        people.addPerson(person1);
        Person expectedName = null;
        //When
        people.removePersonById(person1.getId());
        Person actualName = people.findPersonById(person1.getId());
        //Then
        Assert.assertEquals(expectedName,actualName);
    }
    @Test
    public void findPersonByIdTest(){
        //Given
        People people = new People();
        Person person1 = new Person(754);
        people.addPerson(person1);
        Person expected = person1;
        //When
        Person actual = people.findPersonById(expected.getId());
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removePersonByNameTest(){
        //Given
        People people = new People();
        Person person = new Person(987);
        people.addPerson(person);
        Person expected = null;
        //When
        people.removePersonByName(people.getName());
        Person actual = people.findPersonById(people.getId());
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getListAsArray(){
        //Given
        People people = new People();
        Person person = new Person(987);
        Person person2 = new Person(354);
        people.addPerson(person);
        people.addPerson(person2);
        Object[] expected = people.getListAsArray();
        //When
        Object[] actual = people.getListAsArray();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeAllEntriesTest() {
        //Given
        People people = new People();
        Person person = new Person(987);
        Person person2 = new Person(354);
        people.addPerson(person);
        people.addPerson(person2);
        int expected = 0;
        //When
        people.removeAllEntries();
        int actual = people.getCountOfList();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
