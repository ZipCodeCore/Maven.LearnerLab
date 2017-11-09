package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students INSTANCE;
    // lambda expression
    private static final String[] studentsNames = {
        "Ivan Groznii", "Debi Grigorevichi", "Kovo Eshe"
    };

    private Students(){
        for(int i = 0; i < studentsNames.length; i++){
            super.add(new Student(studentsNames[i], Long.valueOf(i)));
        }
    }
    //lazy initialization
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

}
