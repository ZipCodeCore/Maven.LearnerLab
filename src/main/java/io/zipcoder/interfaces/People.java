package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person > implements Iterable<E> {
    List<E> personList;
   // Person person = new Person(null, null);

    public People() {
        this.personList = new ArrayList<E>();
    }


    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E value : personList) {
            if (value.getId() == id){
                return value;
        }
        }
        return null;
    }

    public void remove(String name) {
        for (E element : personList) {
            if (element.getName() == name) {
                personList.remove(element);
            }
        }
    }

    public void remove(Long id){
        for (E element : personList) {
            if (element.getId() == id) {
                personList.remove(element);
            }
        }
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public Integer count(){
        return personList.size();
    }

    public E[] toArray(){
       return null;
    }


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}