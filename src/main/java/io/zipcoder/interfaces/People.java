package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    private ArrayList<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public ArrayList<E> getPersonList() {
        return personList;
    }

    public void add(E personToAdd) {
        personList.add(personToAdd);
    }

    public void removeByPerson(Person personToRemove) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).equals(personToRemove)) {
                personList.remove(i);
            }
        }
    }

    public void removeById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(i);
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

}
