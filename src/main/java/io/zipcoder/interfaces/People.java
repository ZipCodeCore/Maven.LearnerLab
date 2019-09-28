package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People <E extends Person> {
    List<E> personList = new ArrayList<E>();

    public void addPerson(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for(E person: personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(E person) {
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

    public abstract E[] getArray();
//
    public void removeAll() {
        personList.clear();
    }

}
