package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {

        //personList.contains(Person)

        Person match = null;
        for(Person person : personList){
            if((person.getId() == id )) {
                match = person;
            }
        }
        return match;
    }

    public void remove(Person person) {
        personList.remove(personList.indexOf(person));
    }

    public int getCount() {
        return personList.size();
    }

    public Object getArray() {
        return personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }
}
