package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Instructors INSTRUCTORSINSTANCE = new Instructors();
    String[] instructorArray = {"Tariq Hook","Dolio Durrant","Lion Hunter","Iyasu Watts" };
    private Instructors(){
        for(int i=0;i<instructorArray.length;i++){
            Person person = new Instructor(i+1,instructorArray[i]);
            personList.add(person);
        }
    }

    public static Instructors getINSTRUCTORSINSTANCE() {
        return INSTRUCTORSINSTANCE;
    }
}
