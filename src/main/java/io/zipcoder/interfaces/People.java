package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class People {

    ArrayList <Person> personList = new ArrayList<Person>();

    public void add(Person person){

        personList.add(person);
    }

    public long findById (long id){

        return id;
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

    public Object[] getArray(){

        return personList.toArray();
    }

    public void removeAll(){

        personList.clear();
    }

}
