package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    void add(Person personToAdd){
        personList.add(personToAdd);
    }

    Person findById(long id){
        Person personToReturn = null;
        for (Person person : personList){
            if (person.getId() == id){
                personToReturn = person;
            }
        }
        return personToReturn;
    }

    void remove(Person personToRemove){
        personList.remove(personToRemove);
    }

    void remove(long idToRemove){
        for (Person person : personList){
            if (person.getId() == idToRemove){
                personList.remove(person);
            }
        }
    }

    long getCount(){
        return personList.size();
    }

    Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        personArray = personList.toArray(personArray);
        return personArray;
    }

    void removeAll(){
        for (Person person : personList){
            personList.remove(person);
        }
    }

}
