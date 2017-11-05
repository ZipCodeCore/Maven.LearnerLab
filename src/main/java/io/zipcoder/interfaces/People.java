package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {

        personList.add(person);
    }

    public Person findById(long id) {

        Person returnPerson = null;

        for (Person p : personList) {
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

    public Object[] getArray() {

        return personList.toArray();
    }

    public void removeAll() {

        personList.clear();
    }

}
