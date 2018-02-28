package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class PeopleTest {

    @Test
    public void addPersonTest(){
        //Given
        People people = new People();
        String expectedName = "James";
        long expectedId = 786;
        Person person1 = new Person(expectedId, expectedName);
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
        //When
        people.addPerson(person1);
        people.removePersonById(person1.getId());
        Person expectedName = null;
        Person actualName = people.findPersonById(person1.getId());
        //Then
        Assert.assertEquals(expectedName,actualName);
    }
    @Test
    public void findPersonByIdTest(){
        //Given
        People people = new People();
        String expectedName= "Jim";
        long expectedId = 684;
        Person person1 = new Person(expectedId, expectedName);
        //When
        people.addPerson(person1);
        people.findPersonById(expectedId);
        boolean personHasBeenFound = people.getPersonList().contains(person1);
                //Then
        Assert.assertTrue(personHasBeenFound);
    }

}
