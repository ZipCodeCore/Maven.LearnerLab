package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    List<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public E findByID(Long id) {
        for (E person : personList)
            if (person.getId() == (id))
                return person;
        return null;
    }

    public boolean contains(E person) {
        if(personList.contains(person))
            return true;
        return false;
    }

    public void remove(E person) {
        if(contains(person)) {
            personList.remove(person);
        }
    }

    public void removeById(Long id) {
        E person = findByID(id);
        remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public abstract E[] getArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }

}
