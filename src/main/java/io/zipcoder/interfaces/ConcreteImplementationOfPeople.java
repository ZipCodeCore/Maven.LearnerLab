package io.zipcoder.interfaces;

public class ConcreteImplementationOfPeople extends People<Person>
{
    //We created another class that extends People so that
    // the PeopleTest Class we can instantiate the ConcreteImplementationOfPeople object
    // and call any methods from People.

    public Person[] getArray()
    {
        return personList.toArray(new Person[personList.size()]);
    }



}
