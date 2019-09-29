package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

     ArrayList<E> personList = new ArrayList<E>();


    //methods
    public void add(E addperson){
        personList.add(addperson);
    }

    public void remove(E removeperson){
        personList.remove(removeperson);
    }

    public E findById(long id) {
        for (E e : personList) {
            if (e.getId() == (id)) {
                return e;
            }
        }
        return null;
    }

    public int getCount(){
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll(){
        personList.clear();
    }

}
