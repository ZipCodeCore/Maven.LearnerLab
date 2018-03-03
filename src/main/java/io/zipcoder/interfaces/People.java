package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    public ArrayList<E>personList;


    public People(){
        personList = new ArrayList<E>();

    }

    public void add(E aPerson){
        personList.add(aPerson);
    }
    public E findById(long id){
        for (E aPerson:personList) {
            if(aPerson.getId()==id){
                return aPerson;
            }
        }
        return null;
    }

    public void remove(E person){
        personList.remove(person);
    }
    public void remove(long id){
        for (E aPerson:personList) {
            if(aPerson.getId()==id){
                personList.remove(aPerson);

            }
        }
    }

    public int getCount(){
        return personList.size();
    }
    public abstract E[] getArray();

    public void removeAll(ArrayList<E> anArrayList){
        removeAll(anArrayList);
    }


}
