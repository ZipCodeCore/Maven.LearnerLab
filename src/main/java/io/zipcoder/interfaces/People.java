package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public Boolean remove(Person person){
        if(personList.remove(person)){
            return true;
        }
        return false;
    }

    public void removeById(long id){
        for(Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        return (Person[]) personList.toArray();
    }

    //look at this tomorrow
    public void removeAll(ArrayList<Person> personList){
           removeAll(personList);
    }


}
    /**Create a People class.
        The class should instantiate an ArrayList field of Person objects named personList.
        The class should define a method named add which adds a Person to the personList.
        The class should define a method named findById which makes use of a long id parameter to
     return a Person object with the respective id field.

        The class should define a method named remove which makes use of a
     Person person parameter to remove a respective Person object.

        The class should define a method named remove which makes use of a long id parameter to
     remove a Person object with the respective id field.
        The class should define a method named getCount which returns the size of personList.
        The class should define a method named getArray which returns an array representation of the personList field.
        The class should define a named removeAll which clears our personList field.*/