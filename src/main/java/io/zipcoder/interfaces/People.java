package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    private E e;

    public ArrayList<E> personList = new ArrayList<E>();

    public void addPerson(E person) {
        this.personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (id == person.getId()) {
                return person;
            }
        }
        return null;
    }

    public void removeByName(E person) {
        this.personList.remove(person);
    }

    public void removeById(long id) {
        this.personList.remove(findById(id));
    }

    public int getCount() {
        return personList.size();
    }


    public abstract E[] getArray();

    public void removeAll() {
        personList.clear();
    }


    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
