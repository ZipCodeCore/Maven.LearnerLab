package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person>{

    // E stands for Person

    ArrayList<E> personList;

     public People(){
         this.personList = new ArrayList<E>();
     }

     public void add(E person){
         this.personList.add(person);
     }

     public E findById (long id){

         for (E person : personList){
             if(id == person.getId()){
                 return person;
             }
         }
         return null;
     }

     public void remove (E person){
         this.personList.remove(person);
     }

     public void removeById (long id){
         this.personList.remove(this.findById(id));
     }

     public int getCount(){
         return this.personList.size();
     }

     public abstract E[] getArray();



//         E[] arrayOfPerson = new E[this.personList.size()];
//         return this.personList.toArray(arrayOfPerson);


     public void removeAll(){
         this.personList.clear();
     }

}
