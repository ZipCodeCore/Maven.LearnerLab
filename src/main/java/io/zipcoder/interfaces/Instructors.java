package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();
    Educator[] names = {Educator.TARIQ,Educator.DOLIO, Educator.LEON, Educator.IYASU};
    private Instructors(){
        for(int i=0;i<names.length;i++){
            Instructor person = new Instructor(i+1,names[i].toString());
            personList.add(person);
        }
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }
    @Override
    public Instructor[] getArray(){
        return personList.toArray(new Instructor[personList.size()]);
    }

}
