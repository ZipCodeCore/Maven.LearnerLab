package io.zipcoder.interfaces;

public class ConcretePeople extends People <Person> {

    public Person[] getArray() {

        return personList.toArray(new Person[personList.size()]);
    }
}
