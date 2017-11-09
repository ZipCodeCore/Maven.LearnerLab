package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {

        personList.add(person);
    }

    public Person findById(long id) {

        Person returnPerson = null;

        for (Person p : personList) {
            if (p.getId() == id) {
                returnPerson = p;
                break;
            }


        }
        return returnPerson;
    }


    public void remove(Person person) {

        personList.remove(person);
    }

    public void remove(long id) {

        for (Person p : personList) {
            if (p.getId() == id) {
                remove(p);
                break;
            }

        }
    }

    public int getCount() {

        return personList.size();
    }

    public Person[] getArray() {
        Person[] persons = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            persons[i] = personList.get(i);
        }

        return persons;

    }

    public void removeAll() {

        personList.clear();
    }

}
