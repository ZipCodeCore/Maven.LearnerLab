package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    ArrayList<E> personList = new ArrayList<>();

    public void add(E e){
        personList.add(e);
    }

    public E findById(long id){
        E person = null;
        for (E findPerson: personList){
            if (findPerson.getId() == id) {
                person = findPerson;
            }
        }
        return person;
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll(){
        personList.removeAll(personList);
    }

    public abstract void reset();

}
