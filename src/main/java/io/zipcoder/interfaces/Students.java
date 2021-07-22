package io.zipcoder.interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

 public class Students extends People implements Serializable {
    // Part 7.1
     static final Students INSTANCE;

     private Students(){
    }

    static {
         INSTANCE = new Students();
    }

    public static Students getInstance() {
        return Students.INSTANCE;
    }
}
