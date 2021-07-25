package io.zipcoder.interfaces;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {

    List<E> personList = new ArrayList<>();



    public void add(E person) {
        personList.add(person);
    }

    public E findById(Long id) {
        for(E person : personList){
            if (person.getId() == (id)) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        //if (personList.contains(person)) {
        for( Person person1 : personList) {
            if (person1.getName() == person.name
                    && person1.getId() == person.id) {
                return true;
            }
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

    public abstract E[] toArray();


    @Override
    public Iterator<E> iterator() {
        Iterator iteratorList = personList.iterator();
        return iteratorList;
    }
}
