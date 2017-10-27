package io.zipcoder.interfaces.Class;

import java.util.ArrayList;

public class People {
    ArrayList<Person> peopleList = new ArrayList<Person>();


    public void add(Person person){
        peopleList.add(person);
    }

    public Person findById(long id){

        for(Person person: peopleList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        peopleList.remove(person);
    }

    public void remove(int id){
        for(Person person : peopleList){
            if(person.getId() == id){
                peopleList.remove(person);
            }
        }
    }

    public int getCount(){
        return peopleList.size();
    }

    public ArrayList<Person> getArray(){
        return peopleList;
    }

    public void removeAll(){
        peopleList.clear();
    }
}
