package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students studentsSingleton;

    private Students(Person ... persons){
        for(Person p : persons){
            this.add(p);
        }
    }

    public static Students getInstance(Person ... persons){
        if(studentsSingleton == null){
            studentsSingleton = new Students(persons);
        }
            return studentsSingleton;
    }

}
