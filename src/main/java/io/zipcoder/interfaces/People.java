package io.zipcoder.interfaces;

import java.util.*;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public void remove(Person person) {
        if (personList.contains(person)) personList.remove(person);
    }

    public void remove(long id) {
//        Person personRemove = null;
//        for (Person person : personList) {
//            if (person.getId() == id) personRemove = person;
//        }
//        personList.remove(personRemove);
//    }
        //regular for loop will work with the remove method better
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) personList.remove(personList.get(i));
        }
    }


    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        return personList.toArray(new Person[personList.size()]);
    }

    public void removeAll() {
        personList.clear();
    }
}
