package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public int count() {
        for (Person iterator : personList) {
            personList.size();
        }
        return (personList.size());
    }

    public Person[] getArray() {
        Person[] personArray = new Person[personList.size()];
        for(int i=0; i<personList.size(); i++) {
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    public void removeAll() {
        personList.clear();
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }
}
