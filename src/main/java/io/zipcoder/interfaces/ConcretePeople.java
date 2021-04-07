package io.zipcoder.interfaces;

public class ConcretePeople extends People<Person> {
    public Person[] toArray(){
        Person[] arr = new Person[personList.size()];
        return personList.toArray(arr);
    }
}
