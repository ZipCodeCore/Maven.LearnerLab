package io.zipcoder.interfaces;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People  implements Iterable<Person>{
    private ArrayList<Person> personList;

    public People(ArrayList<Person> personList){
        this.personList = personList;
    }
    public People(){
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        for(Person person : this.personList){
            if(person.getId() == id) {
                return person;
            }
        }  return null;
    }
    public boolean contains(Person person) {
       return this.personList.contains(person);
    }

    public void remove(Person person) {
        this.personList.remove(person);
    }

    public void remove(long id){
         Person personToBeFound = this.findById(id);
         if(personToBeFound != null) {
             this.remove(personToBeFound);
         }
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int count() {
        return this.personList.size();
    }

    public Person[] toArray() {
        return this.personList.toArray(new Person[this.count()]);
    }


    public Iterator<Person> iterator() {
        return this.personList.iterator();
    }
}
