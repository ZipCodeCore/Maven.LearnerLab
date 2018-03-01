package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public Person findById(final long id){
        for (Person person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void removePerson(Person person){
        personList.remove(person);
    }

    public void removeById(final long id){
       for (int i = 0; i < personList.size(); i++){
           if (personList.get(i).getId() == (id)) {
               personList.remove(i);
           }
       }
    }

    public Integer getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        personArray = personList.toArray(personArray);
        return personArray;
    }

    public void removeAll(){
        personList.clear();
    }
}
