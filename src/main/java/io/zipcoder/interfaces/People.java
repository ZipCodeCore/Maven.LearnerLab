package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<T>{
    List<T> personList;

    public People() {
        personList = new ArrayList<T>();
    }

    public void add(T person) {
        personList.add(person);
    }

    public T findById(long id) {
        for (T p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(T person){
        return personList.contains(person);
    }

    public void remove(T person){
        personList.remove(person);
    }
    public void removeById(long id){
        T person = findById(id);
        personList.remove(person);
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public abstract T[] toArray();
//        T[] arr = new T[personList.size()];
//        return personList.toArray(arr);

    public Iterator iterator() {
        return personList.iterator();
    }
}
