package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person> {
    private E e;

    public ArrayList<E> personList = new ArrayList<E>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person  : personList) {
            if (person.getId() == (id)) {
                return person;
            }
        }
        return null;
    }

//    public Person findByName(E person) {
//        return null;
//    }

    public void remove(E person) {
        personList.remove(personList.indexOf(person));
    }

    public void removePersonById(long id) {
        personList.remove(personList.indexOf(id));
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E [] getArray();

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


//{
//        Person[] personArray = new Person[personList.size()];
//        for(int i =0; i< personArray.length; i++) {
//        personArray[i] = personList.get(i);
//        }
//        }
//        return personArray;
