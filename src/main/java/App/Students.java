package App;

import java.util.Arrays;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        for (int i = 0; i < 30; i++) {
            Student student = new Student(personList.size());
            addPerson(student);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}


