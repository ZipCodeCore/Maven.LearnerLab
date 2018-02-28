package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {


    protected ArrayList<E> personList = new ArrayList<E>();

    public void add (E person){
        this.personList.add(person);

    }

    public E findByID(long ID){
        for(E p : personList){
            if(p.getID() == ID) return p;
        }
        return null;
    }

    public void remove(E person){
        this.personList.remove(person);

    }

    public void remove(long ID){
        this.personList.remove(this.findByID(ID));

    }

    public int getCount(){
        return this.personList.size();
    }

    public abstract E[] getArray();

    public void removeAll(){
        this.personList.clear();

    }


}
