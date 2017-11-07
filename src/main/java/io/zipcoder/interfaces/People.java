package io.zipcoder.interfaces;

import java.util.ArrayList;

import static io.zipcoder.interfaces.People.findById;

public class People {


static ArrayList<Person> personList = new ArrayList<Person>();

//The class should define a method named add which adds a Person to the personList.
public static void add(Person person)
{
    personList.add(person);
}



//The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
public static findById(long id){

    Person person = null;
    for(Person findPerson:personList){
        if(findPerson.getId() == id){
            person = findPerson;
        }
    }
    return person;
}

//The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.

public static void remove(Person person){
    personList.remove(person);
}


//The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.

public static void remove(long id) {

    personList.remove(findById(id));
}


public static int getCount() {
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
