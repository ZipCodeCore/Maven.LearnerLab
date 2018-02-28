package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    private final ArrayList<Person> personList = new ArrayList<Person>();

    protected void addPerson(Person person){
        personList.add(person);
    }

    protected Person findById(final long id){
        for (Person person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    protected void removePerson(Person person){
        personList.remove(person);
    }

    protected void removeById(final long id){
       for (int i = 0; i < personList.size(); i++){
           if (personList.get(i).getId() == (id)) {
               personList.remove(i);
           }
       }
    }

    protected Integer getCount(){
        return personList.size();
    }

    protected Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        personArray = personList.toArray(personArray);
        return personArray;
    }

    protected void removeAll(){
        personList.clear();
    }
}
