package io.zipcoder.interfaces;

public class ConcretePeople extends People<Person> {

    public Person[] toArray() {
        Person[] personArray = new Person[this.count()];
        for (int i = 0; i < this.count(); i++) {
            personArray[i] = this.personList.get(i);
        }
        return personArray;
    }
}
