package io.zipcoder.interfaces;

public class Students extends People<Student> {
    private final static Students INSTANCE=new Students();

    private Students() {

        //final Student INSTANCE = new Student(Long.MIN_VALUE, "", 0);

        Student s1= new Student(1L, "Julia", 4);
        super.add(s1);
        Student s2 = new Student(2L, "Miral", 5);
        super.add(s2);
        Student s3 = new Student(3L, "Chris", 3);
        super.add(s3);
        Student s4 = new Student(4L, "Mike", 4);
        super.add(s4);
        Student s5 = new Student(5L, "Grace", 7);
        super.add(s5);
        Student s6 = new Student(6L, "Ron", 4);
        super.add(s6);
        Student s7 = new Student(7L, "Usha", 1.30);
        super.add(s7);
        Student s8 = new Student(8L, "Kane", 4);
        super.add(s8);
        Student s9 = new Student(9L, "Val", 6);
        super.add(s9);
        Student s10 = new Student(10L, "Ryan", 4);
        super.add(s10);
        Student s11 = new Student(11L, "Brian", 9);
        super.add(s11);


    }

     static Students getInstance() {

        return INSTANCE;

    }
    public Student[] toArray() {
        Student[]arr=new Student[INSTANCE.count()];
        int j=0;
        for(int i=0;i<personList.size();i++){
            arr[j]=personList.get(i);
            j++;
        }
        return arr;
    }


}
