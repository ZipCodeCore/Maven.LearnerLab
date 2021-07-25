package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    private List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for(Person person : personList){
            if(person.getId() == id)
                return person;
        }

        return null;
    }
    public  boolean contains(Person person){
        if(personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(Long id){
        for(Person person : personList){
            if(person.getId() == id)
                personList.remove(person);
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] people = personList.toArray(new Person[0]);
        return people;
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
