package io.zipcoder.interfaces;

public class Students extends People<Student> {

    private final static Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }

    private Students() {

        String[] names = {"Aaron", "Abrar", "Andrea", "Andrew", "Brian", "Claude", "Donald", "Elliott", "Gabriella", "Graham",
                "Greg", "Jeff", "Katherine", "Lina", "Linda", "Logan", "Merin", "Oleg", "Pavel", "Raul",
                "Rob", "Ran", "Samuel", "Tim", "Vince", "Wes", "Zach", "Zan"};

        for (int i = 0; i < names.length; i++) {
            Student student = new Student(i);
            student.setName(names[i]);
            personList.add(student);
        }
    }

    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }
}
