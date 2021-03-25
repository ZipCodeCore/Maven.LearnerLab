package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person>  {
    ArrayList<E> personList;
    E person = null;
//    Person person = new Person(01, "Johnny");

    public People(){
        personList = new ArrayList<E>();
    }

//    public Iterator<Person> iterator(){
//        return personList.iterator();
//    }

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(E person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(E person){
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

    public abstract E[] toArray();

//    public String[] toArray(){
//    String[] newArr = personList.toArray(new String[0]);
//    return newArr;
//    }



}
