package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static Students INSTANCE;

    private Students() {
        Student bob = new Student(1);
        Student tom = new Student(2);
        Student ted = new Student(3);
        Student fred = new Student(4);

        this.addPerson(bob);
        this.addPerson(tom);
        this.addPerson(ted);
        this.addPerson(fred);

    }

    public static Students getInstance() {
        if (INSTANCE == null){
         INSTANCE = new Students();
        }
        return INSTANCE;
    }

    public Student[] getArray() {
        Student[] newStudentArray = new Student[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            newStudentArray[i] = personList.get(i);
        }
        return newStudentArray;
    }


}
