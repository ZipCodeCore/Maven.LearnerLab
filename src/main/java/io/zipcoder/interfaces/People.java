package io.zipcoder.interfaces;
import java.util.ArrayList;

public class People extends Person {

    private ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findPersonById(long id) {
        Person p1 = new Person(id, getName());
        for (Person p : personList) {
            if (p.equals(id)) {
                p = p1;
            }
        }
        return p1;
    }
    public void removePersonByName(String name){
        if(personList.contains(name)){
            personList.remove(name);
        }

    }
    public void removePersonById(long id){
        for(Person p : personList){
            if(p.equals(id)){
                personList.remove(p);`
            }
        }
    }
    public Integer getCountOfList(){
        return personList.size();
    }
//    public Object[] getListAsArray(ArrayList<Person> personList){
//        return personList.toArray();
//    }
//    public void removeAllEntries(ArrayList<Person> personList){
//        personList.removeAll(personList);


    public ArrayList<Person> getPersonList() {
        return personList;
    }
}

