package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

//    private static Students ourInstance = new Students();
//

    private Students () {
        Student determinedDan = new Student(1);
        Student eliteEric = new Student(2);
        Student gentleJoe = new Student(5);
        Student pistolPete = new Student(66);
        Student violentVince = new Student(88);

        this.addPerson(determinedDan);
        this.addPerson(eliteEric);
        this.addPerson(gentleJoe);
        this.addPerson(pistolPete);
        this.addPerson(violentVince);
    }

    public static Students getInstance() {

        return INSTANCE;
    }

    public Student[] getStudentArray() {
        Student[] allStudents = new Student[getArray().length];
        for(int i = 0; i < getArray().length; i++) {
            allStudents[i] =  (Student) getArray()[i];
        }
        return allStudents;
    }



}
