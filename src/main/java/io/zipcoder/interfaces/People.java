package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People<P extends Person> {

    private ArrayList<P> personList = new ArrayList<P>();

    public void add(P person) {
        personList.add(person);
    }

    public P findById(long id) {

        P match = null;
        for(Person person : personList){
            if((person.getId() == id )) {
                match = (P) person;
            }
        }
        return match;
    }

    public void remove(Person person) {
        personList.remove(personList.indexOf(person));
    }

    public int getCount() {
        return personList.size();
    }

    public Object[] getArray() {
        return personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }
}
