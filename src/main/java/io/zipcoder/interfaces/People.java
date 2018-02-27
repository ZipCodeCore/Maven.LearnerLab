package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public People() {

    }

    public void add(Person aPerson) {
        this.personList.add(aPerson);

    }

    public Person findByID(long id) {

        for (Person p : personList) {
            if (p.getId() == id) {
                return p;
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

        for (Person p : personList) {
            if (p.getId() == id) {
                personList.remove(p);
            }
        }
    }

    public int getCount() {
        return this.personList.size();
    }

    public ArrayList<Person> getArray() {
        return this.personList;
    }

    public void removeAll() {

        this.personList.clear();
    }


}
