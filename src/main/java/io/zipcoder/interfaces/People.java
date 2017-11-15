package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends  Person>{

    ArrayList<E> personList= new ArrayList<E>();


    public  void add(E person){

        personList.add(person);
    }
    public E findById(long id){
        Person personToReturn;
        for (E personObj:personList) {
            if(personObj.getId()==id)
                return personObj;
        }
        return null;
    }
    public void removeObj(E person){
        if(personList.contains(person))
            personList.remove(person);
    }
    public void  removeId(long id){
        /***** Another option with foreach loop*******/
        //Person toRemove= null;
        //Person personRemove= null;
//        for (Person personObj:personList) {
//            if(personObj.getId()==id){
//                personRemove= personObj;
//                //personList.remove(personObj);
//            }
//        }
//        personList.remove(personRemove);
        for (int i=0;i<personList.size();i++){
            if(personList.get(i).getId()== id)
                personList.remove(personList.get(i));
        }
    }
    public int getCount(){

        return personList.size();
    }
    public abstract E[] getArray();
//        Person[] personArray= new Person[personList.size()];
//        for (Person i:personArray) {

//
        //Person personArray;

    public void removeAll(){
        personList.clear();
    }
}
