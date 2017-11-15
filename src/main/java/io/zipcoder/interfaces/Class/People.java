package io.zipcoder.interfaces.Class;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    private ArrayList<E> peopleList = new ArrayList<E>();

    public void add(E person){
        peopleList.add(person);
    }

    public E findById(long id){

        for(E person: peopleList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(E person){
        peopleList.remove(person);
    }

    public void remove(int id){
        for(E person : peopleList){
            if(person.getId() == id){
                peopleList.remove(person);
            }
        }
    }

    public int getCount(){
        return peopleList.size();
    }

    public ArrayList<E> getPeopleList() {
        return peopleList;
    }

    public abstract E[] getArray();

    public void removeAll(){
        peopleList.clear();
    }
}
