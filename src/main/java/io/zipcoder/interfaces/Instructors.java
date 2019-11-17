package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static Instructors INSTANCE=new Instructors();
    private Instructors(){
        final Instructor INSTANCE=new Instructor(Long.MIN_VALUE,"");
        Instructor t1=new Instructor(101L,"Christopher");
        Instructor t2=new Instructor(102L,"Dolio");
        Instructor t3=new Instructor(103L,"Roberto");
        Instructor t4=new Instructor(104L,"Chris");
        Instructor t5=new Instructor(105L,"Sian");
    }
    static Instructors getInstance(){
        return INSTANCE;
    }
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}
