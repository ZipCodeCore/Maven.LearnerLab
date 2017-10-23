package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public final class Students extends People {

    static{
        final Students INSTANCE;
    }

    private Students() {
        INSTANCE = ;
    }

    public Students getInstance() {
        return INSTANCE;
    }
}
