package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class People<E extends Person> implements Iterable<E> {

    List<E> personList;

    public People(){
        personList = new ArrayList<E>();
    }

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E person : personList)
            if(person.getId() == id)
                return person;

            return null;
    }

    public boolean contains(E person){
        return personList.contains(person);
    }

    public void removeByPerson(E person){
        personList.remove(person);
    }

    public void removeById(long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    abstract E[] getArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
