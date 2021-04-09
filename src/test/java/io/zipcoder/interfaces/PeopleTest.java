package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest{
        People people = new People() {
            @Override
            public Person[] getArray() {
                return new Person[0];
            }
        };
    @Test
    public void addTest(){
        Person expected = new Person("Sue",3);
        people.addPerson(expected);

        Person actual = people.findById(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){

        Person person1= new Person("Sue", 3);
        Person person2= new Person("Sally", 6);
        people.addPerson(person1);
        people.addPerson(person2);
        people.removePerson(person2);

        Integer expected = 1;
        Integer actual = people.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findByIdTest(){
        Person person1= new Person("Sue", 3);
        Person person2= new Person("Sally", 6);
        people.addPerson(person1);
        people.addPerson(person2);

        Person expected = person1;
        Person actual = people.findById(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest(){
        Person person1= new Person("Sue",3);
        Person person2= new Person("Sally",6);
        people.addPerson(person1);
        people.addPerson(person2);
        people.removeById(6);

        Integer expected = 1;
        Integer actual = people.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCountTest(){
        //Given
        Integer expected = 2;
        Person person1= new Person("Sue", 3);
        Person person2= new Person("Sally", 6);
        people.addPerson(person1);
        people.addPerson(person2);
        //When
        Integer actual = people.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest(){
        //Given
        Integer expected = 0;
        //When
        Person person1= new Person("Sue",3);
        Person person2= new Person("Sally", 6);
        people.addPerson(person1);
        people.addPerson(person2);
        people.removeAll();
        Integer actual = people.getCount();
        //Then
        Assert.assertEquals(expected, actual);

    }
}
