package io.zipcoder.interfaces.People;

import io.zipcoder.interfaces.Person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public abstract class People<E extends Person<E>> {
    protected List<E> personList;

    People() {
        personList = new ArrayList<>();
    }

    public void add(E p) {
        personList.add(p);
    }

    public E findById(long id) {
        for (E p : personList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public void remove(E p) {
        personList.remove(p);
    }

    public int getCount() {
        return personList.size();
    }

    abstract E[] getArray();

    public void removeAll() {
        personList.clear();
    }
}
