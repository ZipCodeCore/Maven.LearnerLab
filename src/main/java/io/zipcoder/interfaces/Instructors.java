package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private String[] teacherNameList = new String[]{
            "Tariq Hook",
            "Dolio Durant",
            "Leon Hunter",
            "Mikaila Akeredolu",
            "Yassu"
    };

    private Instructors() {
        for (int i = 0; i < teacherNameList.length; i++) {
            super.add(new Instructor(teacherNameList[i], Long.valueOf(i)));
        }
    }

    public static Instructors getInstance(){
        return Instructors.INSTANCE;
    }
}

