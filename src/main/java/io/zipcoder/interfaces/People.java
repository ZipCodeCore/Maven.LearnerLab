package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

//    Create a People class.
//    The class should instantiate an ArrayList field of Person objects named personList.
//    The class should define a method named add which adds a Person to the personList.
//    The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
//    The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
//    The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
//            The class should define a method named getCount which returns the size of personList.
//    The class should define a method named getArray which returns an array representation of the personList field.
//    The class should define a named removeAll which clears our personList field.


    protected ArrayList<Person>personList;

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void add(Person aPerson){
        personList.add(aPerson);
    }
    public Person findById(long id){
        for (Person aPerson:personList) {
            if(aPerson.getId()==id){
                return aPerson;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){
        for (Person aPerson:personList) {
            if(aPerson.getId()==id){
                personList.remove(aPerson);

            }
        }
    }

    public int getCount(){
        return personList.size();
    }
    public Person[] getArray(){
        return (Person[]) personList.toArray();
    }
    public void removeAll(ArrayList<Person> anArrayList){
        removeAll(anArrayList);
    }


}
