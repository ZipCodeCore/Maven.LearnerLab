package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTRUCTORSINSTANCE = new Instructors();
    Educator[] instructorArray = {Educator.TARIQ,Educator.LEON,Educator.DOLIO};
    private Instructors(){
        for(int i=0;i<instructorArray.length;i++){
            Instructor person =new Instructor(i+1,instructorArray[i].toString());
            personList.add(person);
        }
    }

    public static Instructors getINSTRUCTORSINSTANCE() {
        return INSTRUCTORSINSTANCE;
    }
    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
