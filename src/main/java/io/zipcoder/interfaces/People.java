package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person person: personList) {
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
        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        for (int i = 0; i < personArray.length; i++){
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    public void removeAll(){
        personList.clear();
    }
}
