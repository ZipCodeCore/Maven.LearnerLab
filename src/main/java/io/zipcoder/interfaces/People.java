package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    List<Person> personList;

    public People(){
        personList= new ArrayList<Person>();
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        Person personFinder = null;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId()==id){
                personFinder = personList.get(i);
            }
        }return personFinder;
    }

    public Boolean contains(Person person){
        return personList.contains(person);
    }

    public void removePerson(Person person){
        personList.remove(person);
    }

    public void removeById(Long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(personList.get(i));
            }
        }
    }
    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return ((Person[])personList.toArray());
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
