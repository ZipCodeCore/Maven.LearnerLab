package io.zipcoder.interfaces;

public final class Students extends People <Student>  {

    private static final Students INSTANCE = new Students();

    private Students() {

        String[] names = {"Aaron", "Abrar", "Andrea", "Andrew", "Brian", "Claude", "Donald", "Elliott", "Gabriella", "Graham",
                "Greg", "Jeff", "Katherine", "Lina", "Linda", "Logan", "Merin", "Oleg", "Pavel", "Raul",
                "Rob", "Ran", "Samuel", "Tim", "Vince", "Wes", "Zach", "Zan"};

        for (int i = 0; i < names.length; i++) {
            Student student = new Student();
            student.setName(names[i]);
            this.add(student);
        }

    }

    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
