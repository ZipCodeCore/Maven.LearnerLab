package io.zipcoder.interfaces;

public class ConcretePeople extends People <Person>{
    public Person[] getArray() {
        //return new Student[0];
        return personList.toArray(new Person[personList.size()]);
    }
}
