package io.zipcoder;

import java.util.ArrayList;

public class People{

	protected ArrayList<Person> personList;

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
