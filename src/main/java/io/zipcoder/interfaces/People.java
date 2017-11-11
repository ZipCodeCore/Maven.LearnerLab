package io.zipcoder.interfaces;

//Part 6.1 - Create People class
//
//Create a People class.
//        The class should instantiate an ArrayList field of Person objects named personList.
//        The class should define a method named add which adds a Person to the personList.
//        The class should define a method named findById which makes use of a long id parameter to return a Person
//        object with the respective id field.
//        The class should define a method named remove which makes use of a Person person parameter to remove a
//        respective Person object.
//        The class should define a method named remove which makes use of a long id parameter to remove a Person
//        object with the respective id field.
//        The class should define a method named getCount which returns the size of personList.
//        The class should define a method named getArray which returns an array representation of the personList field.
//        The class should define a named removeAll which clears our personList field.

import java.util.ArrayList;

public abstract class People<E extends Person> {

    private ArrayList<E> personList = new ArrayList<E>();

    public void addPerson(E person){

        personList.add(person);
    }

    public E findById(long id){

          for(int i = 0; i < personList.size(); i++){
              if(personList.get(i).getId() == id){
                return personList.get(i);
              }
          }return null;

    }

    public void removePerson(E person){
        personList.remove(person);
    }

    public void removeById(long id){
         for(int i = 0; i < personList.size(); i++) {
             if (personList.get(i).getId() == id) {
                 personList.remove(personList.get(i));
             }
         }
    }

    public int getCount(){
            return personList.size();
    }

    public abstract E[] getArray();

    public ArrayList<E> getPersonList() {
        return personList;
    }

    public void removeAll(People personList){
        personList.removeAll(personList);
    }

}
