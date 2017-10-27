package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    static ArrayList<Person> personList = new ArrayList<Person>();

    public static void add(Person person){
        personList.add(person);
    }

    public static Person findById(long id){
        Person person = null;
        for (Person findPerson: personList){
            if (findPerson.getId() == id) {
                person = findPerson;
            }
        }
        return person;
    }

    public static void remove(Person person){
        personList.remove(person);
    }

    public static void remove(long id){
        personList.remove(findById(id));
    }

    public static int getCount(){
        return personList.size();
    }

    public static Person[] getArray(){
        Person[] people = new Person[People.getCount()];
        return personList.toArray(people);
    }

    public static void removeAll(){
        personList.removeAll(personList);
    }

}
