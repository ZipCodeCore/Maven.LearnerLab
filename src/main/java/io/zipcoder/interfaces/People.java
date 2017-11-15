package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class People<T extends Person> {

    public ArrayList<T> personList = new ArrayList();

    public abstract T[] getArray();

    public void add(T person) {
        personList.add(person);
    }

    public T findById(long id) {

        T match = null;
        for(Person person : personList){
            if((person.getId() == id )) {
                match = (T) person;
            }
        }
        return match;
    }

    public void remove(T person) {
        personList.remove(personList.indexOf(person));
    }

    public int getCount() {
        return personList.size();
    }

    public void removeAll() {
        personList.clear();
    }
}
