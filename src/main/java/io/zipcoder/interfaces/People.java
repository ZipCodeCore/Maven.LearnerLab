package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person person: personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        Person removedPerson = null;
        for (Person person: personList){
            if(person.getId() == id){
                removedPerson = person;
            }
        }
        remove(removedPerson);
    }

    public int getCount(){
        return personList.size();
    }

    public void removeAll(){
        personList.clear();
    }

    public Person[] getArray(){
        return personList.toArray(new Person[0]);
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }
}
