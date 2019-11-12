package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person person : personList)
            if(person.getId() == id)
                return person;

            return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void removeByPerson(Person person){
        personList.remove(person);
    }

    public void removeById(long id){
        for(Person person : personList)
            if(person.getId() == id)
                personList.remove(person);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return ((Person[]) personList.toArray());
    }

    public Iterator<Person> iterator() {
        return null;
    }
}
