package io.zipcoder.interfaces;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Collection;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();
    Person person;

    {
        personList = new ArrayList<Person>();
        person = new Person(3);
    }

    public Boolean add(Person person) {
        return personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (id == person.getId()) {
                return person;
                // for every person in the personList if the id is equal to the id in
                //the parameters then use person.getId and return the person associated
                // with that ID number
            }
        }
        return null;
    }

    public void remove(long id) {
        personList.remove(id);
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray(){
       Person[] person =  personList.toArray(new Person[0]);
       // have to cast to person []
        return person;
    }

    public void removeAll() {
        personList.clear();
    }
}
