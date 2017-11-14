package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    private ArrayList<E> personList = new ArrayList<>();

    public People() {
        personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public ArrayList<E> getPersonList() {
        return personList;
    }

    public E findById(long id) {
        for (E person : personList) {
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

    public abstract E[] getArray();

    public void removeAll() {
        personList.clear();
    }
}
