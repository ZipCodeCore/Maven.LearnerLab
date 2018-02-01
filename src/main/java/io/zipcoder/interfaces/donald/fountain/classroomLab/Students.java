package io.zipcoder.interfaces.donald.fountain.classroomLab;

import java.util.HashMap;
import java.util.Map;

public final class Students extends People<Student> {

    private final static Students INSTANCE = new Students();

    private Students() {

        String[] names = {"Donald", "Jeff", "Samuel", "Wesley", "Logan", "Aaron", "Abra", "Andrew", "Brian", "Claude", "Elliot", "Froilan", "Gabriela",
                "Graham", "Greg", "Katherine", "Lina", "Merin", "Oleg", "Pavel", "Raul", "Ryan", "Timothy", "Vince", "Zachary", "Zan"};

        int count = 0;

        for (String name : names) {
            count++;

            Student student = new Student(count);
            student.setName(name);

            super.addPerson(student);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] getArray() {
//        Student[] students = new Student[personList.size()];
//        for(int i = 0; i < personList.size(); i++){
//            students[i] = personList.get(i);
//        }
//        super.personList.stream().toArray(Student[] :: new);
        return personList.toArray(new Student[personList.size()]);
    }

    public Map<Student,Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for (Student student: personList) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
