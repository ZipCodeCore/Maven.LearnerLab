package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    List<Person> personList = new ArrayList<>();
    Person[] personArray;


    public void add (Person person){
        this.personList.add(person);
    }

    public Person findById(Long id){

        for (Person eachPerson : this.personList){
            if (eachPerson.getId() == id) return eachPerson;
        }
        return null;
    }

    public Boolean contains(Person person){
        return this.personList.contains(person);
    }

    public void remove(Person person){
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

    public Person[] toArray(){
        return this.personList.toArray(personArray);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
