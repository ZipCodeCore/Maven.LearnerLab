package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    List<E> elementList = new ArrayList<E>();


    public void add(E element){
        elementList.add(element);
    }

    public E findById(Long id) {
        for (E element: elementList) { //enhanced for each Person in person list
           if (element.getId().equals(id)) {
           }    return element;
        }
        return null; //need to return something
    }

    public Boolean contains(E element) {
        if (elementList.contains(element)) {
            return true;
        }
            return false; // if personlist does not contain person return false
    }

    public void remove(E element) {
        elementList.remove(element);
    }

    public void removeById(Long id) {
        remove(findById(id)); //use find id method to remove id
    }

    public void removeAll() {
        elementList.clear();
    }

    public int count() {
       return elementList.size();
    }

    public abstract E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return elementList.iterator();
    }
}
