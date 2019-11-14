package io.zipcoder.interfaces;

public class Students extends People<Student> {

    public static final Students INSTANCE = new Students();

        private Students(){
            Student student = new Student(34L,"Gau");
            Student student2 = new Student(45L, "Sabin");
            Student student3 = new Student(67L,"Cyan");
            Student student4 = new Student (81L,"Shadow");
            personList.add(student);
            personList.add(student2);
            personList.add(student3);
            personList.add(student4);
        }

        public static Students getInstance(){
            return INSTANCE;
        }


    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[personList.size()]) ;
    }
}
