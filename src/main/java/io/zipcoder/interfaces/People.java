package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    private ArrayList<E> personList = new ArrayList<E>();

    public ArrayList<E> getPersonList() {
        return personList;
    }

    public E findById(long id){
        for (E aPerson : personList) {
            if (aPerson.getId() == id) {
                return aPerson;
            }
        }
        return null;
    }

    public void add(E aPerson){
        personList.add(aPerson);
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
        personList.removeAll(personList);
    }
}
