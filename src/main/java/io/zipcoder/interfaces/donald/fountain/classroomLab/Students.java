package io.zipcoder.interfaces.donald.fountain.classroomLab;

public final class Students extends People {

    private final static Students INSTANCE = new Students();

    private Students() {

        String[] names = {"Donald", "Jeff", "Samuel", "Wesley", "Logan", "Aaron", "Abra", "Andrew", "Brian", "Claude", "Elliot", "Froilan", "Gabriela",
                "Graham", "Greg", "Katherine", "Lina", "Merin", "Oleg", "Pavel", "Raul", "Ryan", "Timothy", "Vince", "Zachary", "Zan"};

        int count = 0;

        for (String name : names) {
            count++;

            Person student = new Student(count);
            student.setName(name);

            super.addPerson(student);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
