package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(Person person) {
        if (personList.contains(person)) {
            personList.remove(person);
        }
    }

    public void remove(long id) {
        Person found = findById(id);
        if (found != null) {
            personList.remove(found);
        }
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        return (Person[]) personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }
}
