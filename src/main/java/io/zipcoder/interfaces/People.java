package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    //The class should instantiate an ArrayList field of Person objects named personList.
    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id){
//        The class should define a method named findById which makes use of a long id parameter
//        to return a Person object with the respective id field.
    }


}
