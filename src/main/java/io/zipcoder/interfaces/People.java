package io.zipcoder.interfaces;

import java.util.*;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        Person returnPerson = null;

        for (Person p1 : personList) {
            if (p1.getId() == id) {
                returnPerson = p1;
                break;
            }
        }
        return returnPerson;
    }

    public void remove(Person person) {

        personList.remove(person);
    }

    public void remove(long id) {

        for (Person p1 : personList) {
            if (p1.getId() == id) {
                remove(p1);
                break;
            }
        }

    }

    public int getCount() {

        return personList.size();
    }

    public Person[] getArray() {
        Person[] personArray = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    public void removeAll(){

        personList.removeAll(personList);
    }
}

