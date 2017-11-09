package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static Instructors INSTANCE;
    //lambda expression
    static final String[] instructorsName = {
            "Kazuo Ishiguro", "Michael Rosbash", "Barry Barish"
    };

    private Instructors(){
        for(int i = 0; i < instructorsName.length; i++){
            super.add(new Student(instructorsName[i], Long.valueOf(i)));
        }
    }
    //lazy initialization
    public static Instructors getINSTANCE(){
        if (INSTANCE != null){
            return INSTANCE;
        }
        else{
            INSTANCE = new Instructors();
            return INSTANCE;
        }
    }

    public String[] contains(String[] instructorsName){
        return instructorsName;
    }
}
