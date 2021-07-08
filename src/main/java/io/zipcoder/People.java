package io.zipcoder;

import java.util.ArrayList;

public abstract class People<E extends Person>{

	protected ArrayList<E> personList;

	public People(){
	    this.personList = new ArrayList<>();
    }

	public void add(E person){
		this.personList.add(person);
	}

	public E findById(long id){
        for (E person:this.personList) {
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

    public void remove(long id){
        for (int i = 0; i < this.personList.size(); i++){
            if (this.personList.get(i).getId() == id) this.personList.remove(i);
        }
    }

	public int getCount(){
		return this.personList.size();
	}

	public abstract E[] getArray();

	public void removeAll(){
		this.personList = new ArrayList<>();
	}

}
