package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person person = null;
        for (Person findPerson: personList){
            if (findPerson.getId() == id) {
                person = findPerson;
            }
        }
        return person;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] people = new Person[personList.size()];
        return personList.toArray(people);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

}
