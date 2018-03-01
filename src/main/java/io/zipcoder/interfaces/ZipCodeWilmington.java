package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    private static ZipCodeWilmington ourInstance = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return ourInstance;
    }

    private ZipCodeWilmington() {
    }
}
