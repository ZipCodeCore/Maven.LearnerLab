package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person<E>>{
    //The class should instantiate an ArrayList field of Person objects named personList.
    protected ArrayList<E> personList;

    People(){
        personList = new ArrayList<E>();
    }




    public void add(E person){
        this.personList.add(person);
    }

    public E findById(long id){
        //so what we are doing here is saying for type Person person in the personlists array
        //if the id equals the persons id then return the id.
        for(E person : personList){
            if(id==person.getId()){
                return person;
            }
        }
        return null;
    }

    public void remove(E person){
        //go in the list
        //and remove the person
        personList.remove(person);
    }

    public void removeId(long id){
        //remove Person object w/ the same id field
        //just like above

        for(E person : personList){
            if(id==person.getId()){
                remove(person);
            }
        }
    }

    public int getCount(){

        return personList.size();
    }

    abstract E[] getArray();
//        E[] personArray = new E[personList.size()];
//        return personList.toArray(personArray);


    public void removeAll(){
        personList.clear();
    }

    public abstract void removeId(Instructor person);

    public abstract void removeId(Person person);

    //public abstract void removeId(E person);
}
