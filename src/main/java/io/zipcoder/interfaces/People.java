package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    public static ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findByID(long id){
        for(Person person: personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);

    }

    public void remove(long id){
        remove(findByID(id));
    }

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        return (Person[]) personList.toArray();
    }

    public void removeAll(){
        personList.clear();
    }
}
