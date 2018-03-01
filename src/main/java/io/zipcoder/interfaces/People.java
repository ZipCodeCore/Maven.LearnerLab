package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    ArrayList<E>personList = new ArrayList<E>();


    public People(){

    }

    public void add(E aPerson){
        personList.add(aPerson);
    }
    public E findById(long id){
        for (E aPerson:personList) {
            if(aPerson.getId()==id){
                return aPerson;
            }
        }
        return null;
    }

    public void remove(E person){
        personList.remove(person);
    }
    public void remove(long id){
        for (E aPerson:personList) {
            if(aPerson.getId()==id){
                personList.remove(aPerson);

            }
        }
    }

    public int getCount(){
        return personList.size();
    }
    public abstract E[] getArray();
//    {
//       E[] personArray = new E[personList.size()];
//
//        for (int i = 0; i < personArray.length; i++) {
//            personArray[i] = personList.get(i);
//        }
//        return personArray;
//        for(int i =0; i<students.length;i++){
//            students[i]=(Student)getArray()[i];
//
//        return  personList.toArray(new Person[0]);
//    }
//    public Student[] getStudentArray(){
//        Student[] students = new Student[getArray().length];
//        for(int i =0; i<students.length;i++){
//            students[i]=(Student)getArray()[i];
//        }
//        return students;
//    }

    public void removeAll(ArrayList<E> anArrayList){
        removeAll(anArrayList);
    }


}
