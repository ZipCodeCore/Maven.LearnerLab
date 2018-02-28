import io.zipcoder.interfaces.Learner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class People <E extends Person> {

    ArrayList<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }
    public E findById(long id){
        for (E personId : personList){
            if (id == personId.getId()){
                return personId;
            }
        }
        return null;
    }
    public void remove(E person){
        personList.remove(person);
        }

    public void remove(long id) {
        for (E personId : personList) {
            if (id == personId.getId()) {
                personList.remove(personId);
            }
        }
    }
    public int getCount(){
        return personList.size();
    }
    public abstract E[] getArray();
    //{
//        Person[] personArray = new Person[personList.size()];
//        for (int i = 0; i < personArray.length; i++){
//            personArray[i] = personList.get(i);
//        }
//        return personArray;
    //}

//    public Learner[] becomeLearner(){
//        Learner[] learnerArray = new Learner[getArray().length];
//        for (int i = 0; i < learnerArray.length; i++){
//            learnerArray[i] = (Student) personList.get(i);
//        }
//        return learnerArray;
//    }
    public void removeAll(){
        personList.clear();
    }
}
