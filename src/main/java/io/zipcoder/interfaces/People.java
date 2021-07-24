package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    List<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(Long id){
        for(E element : personList){
            if(element.getId() == id){
                return element;
            }
        }
        return null;
    }

    public Boolean contains(E person){
        return personList.contains(person);
    }

    public Boolean remove(E person){
        return personList.remove(person);
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public abstract E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
