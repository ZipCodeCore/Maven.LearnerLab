package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        this.personList.add(person);

    }

    public Person findByID(long ID){
        for(Person p : personList){
            if(p.getID() == ID) return p;
        }
        return null;
    }

    public void remove(Person person){
        this.personList.remove(person);

    }

    public void remove(long ID){
        this.personList.remove(this.findByID(ID));

    }

    public int getCount(){
        return this.personList.size();
    }

    public Person[] getArray(){
        return this.personList.toArray(new Person[this.getCount()]);
    }

    public void removeAll(){
        this.personList.clear();

    }


}
