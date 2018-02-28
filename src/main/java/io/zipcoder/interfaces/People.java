package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    ArrayList<Person> personList = new ArrayList<Person>();


    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(Person person : personList){
            if(person.getId() == id){
                return (E)person;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int getCount(){
        return personList.size();
    }

    public abstract E[] getArray();
}
