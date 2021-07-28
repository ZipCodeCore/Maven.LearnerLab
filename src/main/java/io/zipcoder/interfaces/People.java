package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {


    public List<E> personList = new ArrayList<E>();


    public void addPerson(E person) {
        personList.add(person);

    }

    public E findById(Long id) {
        for (E person : personList) {
            if (person.getId() == id)
                return person;
        }

        return null;
    }

    public boolean containsPerson(E person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void removePerson(E person) {
        personList.remove(person);
    }

    public void removeById(Long id) {
        for (E person : personList) {
            if (person.getId() == id)
                personList.remove(person);
        }
    }

    public void removeAllPeople() {
        personList.clear();
    }

    public Integer count() {

        return personList.size();
    }

    public abstract E[] toArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}

