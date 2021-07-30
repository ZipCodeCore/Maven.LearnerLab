package io.zipcoder.interfaces;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {

    }

    public static Students getInstance() {

        return INSTANCE;
    }


    @Override
    public Student[] getArray() {
        Student[] studentArray = new Student[personList.size()];

        for (int i = 0; i < personList.size(); i++) {
            studentArray[i] = personList.get(i);
        }
        return studentArray;
    }


//    public Student[] getStudentsArray() {
//
//        Student[] studentsArray = new Student[getArray().length];
//
//        for (int i = 0; i < studentsArray.length; i++) {
//            studentsArray[i] = (Student) getArray()[i];
//        }
//        return studentsArray;
//    }

}
