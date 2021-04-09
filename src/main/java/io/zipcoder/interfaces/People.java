package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    ArrayList<E> personList = new ArrayList<E>();

    public void addPerson(E e){
        personList.add(e);
    }

    public E findById(final long id){
        for (E e : personList){
            if (e.getId() == id){
                return e;
            }
        }
        return null;
    }

    public void removePerson(E e){
        personList.remove(e);
    }

    public void removeById(final long id){
       for (int i = 0; i < personList.size(); i++){
           if (personList.get(i).getId() == (id)) {
               personList.remove(i);
           }
       }
    }

    public Integer getCount(){
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll(){
        personList.clear();
    }
}
