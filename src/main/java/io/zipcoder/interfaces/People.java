package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    ArrayList<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
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
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public int getCount() {
        int count = personList.size();
        return count;
    }

    public abstract ArrayList<E> getArray();

    public void removeAll() {
        for (Person person : personList) {
            personList.remove(person);
        }
    }
}
