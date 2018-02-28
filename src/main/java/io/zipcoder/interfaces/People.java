package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        if (personList == null) {
            personList.add(person);
        } else {
            personList.contains(person);
            personList.add(person);
        }
    }

    public Person findById(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }return null;
    }

    public void remove(Person person){

        personList.remove(person);

    }

    public void remove(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public int getCount(){

        return personList.size();
    }

    public Person[] getArray(){

        return personList.toArray(new Person[personList.size()]);
    }

    public void removeAll(){

        personList.clear();
    }
}
