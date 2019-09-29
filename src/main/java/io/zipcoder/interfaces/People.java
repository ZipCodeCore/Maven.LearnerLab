package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);

    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);

    }
    public void remove(long id){
        Person person = findById(id);
        this.remove(person);
    }
    public int getcount(){
        return personList.size();
    }
    public Person[] getArray(){
       Person[] persons = new Person[personList.size()];
       for(int i = 0; i <persons.length; i++){
           Person currentPerson = personList.get(i);
           persons[i] = currentPerson;
       }

       return persons;

    }
    public void removeAll(){
       personList.clear();
    }
}