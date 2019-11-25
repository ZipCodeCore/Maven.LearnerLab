package io.zipcoder.interfaces;

public final class Students extends People<Person>{

    private static final Students INSTANCE = new Students();

    private Students(){
        super.add(new Student(05, "Ban"));
        super.add(new Student(06, "chod"));
    }

    public Person[] toArray() {
        return new Person[0];
    }

    public static Students getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }
        else{
            return INSTANCE;
        }
    }
}
