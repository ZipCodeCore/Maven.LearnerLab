import io.zipcoder.interfaces.Learner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        for (Person personId : personList){
            if (id == personId.getId()){
                return personId;
            }
        }
        return null;
    }
    public void remove(Person person){
        personList.remove(person);
        }

    public void remove(long id) {
        for (Person personId : personList) {
            if (id == personId.getId()) {
                personList.remove(personId);
            }
        }
    }
    public int getCount(){
        return personList.size();
    }
    public Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        for (int i = 0; i < personArray.length; i++){
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    public Learner[] becomeLearner(){
        Learner[] learnerArray = new Learner[getArray().length];
        for (int i = 0; i < learnerArray.length; i++){
            learnerArray[i] = (Student) personList.get(i);
        }
        return learnerArray;
    }
    public void removeAll(){
        personList.clear();
    }
}
