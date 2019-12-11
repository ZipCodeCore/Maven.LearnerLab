package io.zipcoder.interfaces;

public class ConcretePeople extends People<Person>{

    public Person [] listToArray () {
        Person[] myPeople = new Person[this.personList.size()];
        myPeople = this.personList.toArray(myPeople);
        return myPeople;
    }
}
