package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterator<Person> {

    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for (Person person : personList) {
           if (person.getId() == id)
               return person;
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(Long id){
        personList.removeIf(person -> person.getId() == id);

    }
    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator(){
        return  personList.iterator();
    }

    public boolean hasNext() {
        return false;
    }

    public Person next() {
        return null;
    }
}
