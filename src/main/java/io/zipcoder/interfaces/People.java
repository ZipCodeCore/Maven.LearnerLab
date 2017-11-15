package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> {

    public ArrayList<E> personList = new ArrayList();

    public void add(E person){
        personList.add(person);
    }

    public E findByID(long id){
        for(E person: personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void remove(long id){
        remove((E) findByID(id));
    }

    public int getCount(){
        return personList.size();
    }

    abstract <E> E[] getArray();

    public List<E> getArrayList() {
        return personList;
    }

    public void removeAll(){
        personList.clear();
    }
}
