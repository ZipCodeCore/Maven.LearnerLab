package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static Students INSTANCE;

    private static final String[] studentsNames = {
        "Ivan Groznii", "Debi Grigorevichi", "Kovo Eshe"
    };

    private Students(){
        for(int i = 0; i < studentsNames.length; i++){
            personList.add(new Student(studentsNames[i], (long) i));
        }

    }


    public static Students getINSTANCE() {
        if(INSTANCE != null){
            return INSTANCE;
        }
        else {
            INSTANCE = new Students();
            return INSTANCE;
        }
    }

    public String[] contains(String[] studentsNames) {
        return studentsNames;
    }


    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }
}
