package io.zipcoder.interfaces;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable<E> {
    List<Person> personList = new ArrayList<>();


    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(Long id) {
        for(Person person : personList){
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

     public void remove(Long id) {
        personList.remove(findById(id));
     }

    public void removeAll() {
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }


    @Override
    public Iterator<E> iterator() {
        Iterator<E> personList = new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
        return personList;
    }
}
