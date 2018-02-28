package io.zipcoder;

import java.util.ArrayList;
import java.util.Iterator;

public class People{

	protected ArrayList<Person> personList;

	public People(){
	    this.personList = new ArrayList<>();
    }

	public void add(Person person){
		this.personList.add(person);
	}

	public Person findById(long id){
        for (Person person:this.personList) {
            if (person.getId() == id){
                return person;
            }
        }
        return null;
	}

	public void remove(Person person){
        for (int i = 0; i < this.personList.size(); i++){
            if (this.personList.get(i).equals(person)) this.personList.remove(i);
        }
	}

	public int getCount(){
		return this.personList.size();
	}

	public Person[] getArray(){
		Person[] returnArray = personList.toArray(new Person[personList.size()]);
        return returnArray;
    }

	public void removeAll(){
		this.personList = new ArrayList<>();
	}

}
