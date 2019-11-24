package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList = new ArrayList<Person>();
    Person person = new Person(01, "Johnny");

    public Iterator<Person> iterator(){
        return personList.iterator();
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(i);
            }
        }
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public Integer count(){
        return personList.size();
    }

    public String[] toArray(){
    String[] newArr = personList.toArray(new String[0]);
    return newArr;
    }



}
