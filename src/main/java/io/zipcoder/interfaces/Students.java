package io.zipcoder.interfaces;

public final class  Students extends People<Student>{
    private static final Students INSTANCE=new Students();

    private Students(){
        for (int i=1; i<35; i++)
        super.add(new Student(i));
    }


    public static Students getInstance(){
        return INSTANCE;
    }

}
