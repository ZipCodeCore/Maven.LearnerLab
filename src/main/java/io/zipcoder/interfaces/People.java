package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person>{

    ArrayList<E> personList = new ArrayList<>();


    public void add(E person){

        personList.add(person);
    }

    public E findById(long id){
        /*for (int i =0; i<=personList.size(); i++){
            Person currentPerson = personList.get(i);
            long idCurrent = currentPerson.getId();
            if (idCurrent == id){
                return currentPerson;
            }

        }return null;**/
        for (E currentPerson: personList){
            if (currentPerson.getId() == id){
                return currentPerson;
            }
        }return null;
    }

    public void remove(Person person){
        personList.remove(person);

    }

    public void remove(long id){
        remove(findById(id));

    }

    public int getCount(){
        return personList.size();

    }

    public abstract E[] getArray();
       // Person[] persons = new Person[getCount()];
        //for(int i=0; i<persons.length; i++) {
        //    persons[i] = personList.get(i);
      //  }
      //  return persons;

   // }

    public void removeAll(){

        personList.clear();
    }

}

