package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        long id = 0;
        for (StudentNames names : StudentNames.values()) {
            id++;
            INSTANCE.add(new Student(id));
            Person person = findById(id);
            person.setName(names.toString());
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
