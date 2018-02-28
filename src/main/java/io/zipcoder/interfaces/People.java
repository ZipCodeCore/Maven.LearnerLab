package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

     private ArrayList<Person> personList = new ArrayList<Person>();

     public void add(Person person){
         this.personList.add(person);
     }

     public Person findById (long id){

         for (Person person : personList){
             if(id == person.getId()){
                 return person;
             }
         }
         return null;
     }

     public void remove (Person person){
         this.personList.remove(person);
     }

     public void removeById (long id){
         this.personList.remove(this.findById(id));
     }

     public int getCount(){
         return this.personList.size();
     }

     public Person[] getArray(){
         Person[] arrayOfPerson = new Person[this.personList.size()];
         return this.personList.toArray(arrayOfPerson);
     }

     public void removeAll(){
         this.personList.clear();
     }

}
