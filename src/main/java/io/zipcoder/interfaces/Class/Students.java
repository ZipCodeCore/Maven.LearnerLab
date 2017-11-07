package io.zipcoder.interfaces.Class;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    public Students(){
        String[] allStudents = {"Aaron","Abrar","Andrea","Andrew","Brian","Claude","Donald","Elliott","Gabriela",
        "Graham","Greg","Jeff","Katherine","Lina","linda","Logan","Merin","Oleg","Pavel","Raul","Rob","Ryan","Samuel",
        "Timothy","Vince","Wes","Zach","Zan"};

        for(int studentID = 0; studentID<allStudents.length;studentID++){
            Student currentStudent = new Student(studentID);
            String name = allStudents[studentID];
            currentStudent.setName(name);
            add(currentStudent);
        }

    }



}
