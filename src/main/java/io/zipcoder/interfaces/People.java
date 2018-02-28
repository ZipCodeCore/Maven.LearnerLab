package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    private ArrayList<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for(Person person: personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(Person person) {
        if(personList.contains(person)) {
            personList.remove(person);
        }
    }

    public void remove(long id) {
        personList.remove(this.findById(id));
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        int index = 0;
        Person[] personArray = new Person[personList.size()];
        for (Person person: personList) {
            personArray[index] = person;
            index++;
        }
        return personArray;
    }

    public void removeAll() {
        personList.clear();
    }

}
