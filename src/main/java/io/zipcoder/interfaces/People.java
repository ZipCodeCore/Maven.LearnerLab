package io.zipcoder.interfaces;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E>{

    List<E> personList = new ArrayList<>();
    E[] personArray;


    public void add (E person){
        this.personList.add(person);
    }

    public E findById(Long id){

        for (E eachPerson : this.personList){
            if (eachPerson.getId() == id) return eachPerson;
        }
        return null;
    }

    public Boolean contains(E person){
        return this.personList.contains(person);
    }

    public void remove(E person){
        if (contains(person)){
            this.personList.remove(person);
        }
    }

    public void remove(Long id){
        this.personList.remove(findById(id));
    }

    public void removeAll(){
        this.personList.clear();
    }

    public Integer count(){
        return this.personList.size();
    }

    public abstract E[] toArray();

    public Iterator<E> iterator() {
        return this.personList.iterator();
    }

}
