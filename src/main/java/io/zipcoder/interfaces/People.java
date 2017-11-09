package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList= new ArrayList<Person>();
    public void add(Person person){

        personList.add(person);
    }
    public Person findById(long id){
        Person personToReturn;
        for (Person personObj:personList) {
            if(personObj.getId()==id)
                return personObj;
        }
        return null;
    }
    public void removeObj(Person person){
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
    public Person[] getArray() {
//        Person[] personArray= new Person[personList.size()];
//        for (Person i:personArray) {

//
        //Person personArray;
        return personList.toArray(new Person[personList.size()]);
    }
    public void removeAll(){
        personList.clear();
    }
}
