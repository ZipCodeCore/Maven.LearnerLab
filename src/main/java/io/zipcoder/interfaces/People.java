package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    public ArrayList<Person> personList = new ArrayList<Person>();



    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
       for (Person p : personList){
            if (p.getId() == id );
                return p;
       } return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(id);
    }
    public int getCount(){
        return personList.size();
    }
    public Object [] getArray(){
        return personList.toArray();
    }
    public void removeAll() {
        personList.clear();
    }
}
