package io.zipcoder.interfaces;

public class Students extends People <Student> {
    private static Students INSTANCE;

    private Students(){};

    public static Students getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }

        static {
            INSTANCE = new Students();
            for (int i = 0; i < 35; i++) {
                INSTANCE.addPerson(new Student(i+1L, "STUDENT"+i));
            }
        }


    @Override
    public Student[] listToArray() {
        return this.personList.toArray(new Student[0]);
    }
}

//    //Eager Instantiation
//    //Nullary constructor with intialized Students
//    private Students() {
//    INSTANCE = new Students ()
//    }
