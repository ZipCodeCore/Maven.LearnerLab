package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterator<Person> {

    List<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }

    public Person findById(Long id){
        for (Person person : personList) {
            Long currentId = person.getId();
            boolean isSameId = currentId.equals(id);
           if (isSameId)
               return person;
        }
        return null;
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void removeById(Long id){
        personList.removeIf(person -> person.getId().equals(id));

    }
    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] getArray();


    public Iterator<E> iterator(){
        return  personList.iterator();
    }

    public boolean hasNext() {
        return false;
    }

    public Person next() {
        return null;
    }
}
