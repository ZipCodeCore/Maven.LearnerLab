package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person> {

    ArrayList<E> personList = new ArrayList<E>();

    public People() {

    }

    public void add(E aPerson) {
        this.personList.add(aPerson);
    }

    public E findByID(long id) {
        for (E p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void remove(E person) {

        if (personList.contains(person)) {
            personList.remove(person);
        }
    }

    public void remove(long id) {

        for (E p : personList) {
            if (p.getId() == id) {
                personList.remove(p);
            }
        }
    }

    public int getCount() {
        return this.personList.size();
    }

    public abstract E[] getArray();

    public void removeAll() {

        this.personList.clear();
    }


}
