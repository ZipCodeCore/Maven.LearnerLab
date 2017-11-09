package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testPeople {
    People people = new People();
    Person person1= new Person(23,"Merin");
    Person person2= new Person(24,"Lina");
    Person person3= new Person(25,"Sam");
    @Test
    public void testAdd(){
        People people= new People();
        Person person1= new Person(23,"Merin");
        Person person2= new Person(24,"Lina");
        Person person3= new Person(25,"Sam");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person expected = person1;
        Person actual= people.personList.get(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        People people= new People();
        Person person1= new Person(23,"Merin");
        Person person2= new Person(24,"Lina");
        Person person3= new Person(25,"Sam");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.removeId(25);
        //System.out.println(people.personList.size());
        Assert.assertFalse(people.personList.contains(person3));
    }
    @Test
    public void testFindById(){
        People people= new People();
        Person person1= new Person(23,"Merin");
        Person person2= new Person(24,"Lina");
        Person person3= new Person(25,"Sam");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person expectedPerson= person2;
        Person actualPerson= people.findById(24);
        Assert.assertEquals(expectedPerson,actualPerson);
    }
    @Test
    public void testremoveObj(){
        People people= new People();
        Person person1= new Person(23,"Merin");
        Person person2= new Person(24,"Lina");
        Person person3= new Person(25,"Sam");
        people.add(person1);
        people.add(person2);
        people.add(person3);

    }
}
