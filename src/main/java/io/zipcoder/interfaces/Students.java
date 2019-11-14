package io.zipcoder.interfaces;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students(){

        Student studentOne = new Student(212242L, "Brian");
        Student studentTwo = new Student(121231L, "Kievina");

        personList.add(studentOne);
        personList.add(studentTwo);

    }

    @Override
    public Student[] getArray(){

        return personList.toArray(new Student[personList.size()]);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
