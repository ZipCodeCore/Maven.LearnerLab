package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    //No casting tricks were used in the people class (as per 10.1 and 10.2

    ArrayList<E> personList = new ArrayList<E>();

    public void add(E person) {

        personList.add(person);
    }

    public E findById(long id) {

        E returnPerson = null;

        for (E p : personList) {
            if (p.getId() == id) {
                returnPerson = p;
                break;
            }


        }
        return returnPerson;
    }


    public void remove(Person person) {

        personList.remove(person);
    }

    public void remove(long id) {

        for (Person p : personList) {
            if (p.getId() == id) {
                remove(p);
                break;
            }

        }
    }

    public int getCount() {

        return personList.size();
    }

    public abstract E[] getStudentArray();

    public void removeAll() {

        personList.clear();
    }

}
