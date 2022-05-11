public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }
    private Students() {
        Student Anthony = new Student(111);
        Student Brian = new Student(222);
        Student Bo = new Student(333);
        Student Carolynn = new Student(444);
        Student Dan = new Student(555);
        Student Eric = new Student(666);
        Student Joe = new Student(777);
        Student Katrice = new Student(888);
        Student Lawrence = new Student(999);
        Student Luis = new Student(1010);

        personList.add(Anthony);
        personList.add(Brian);
        personList.add(Bo);
        personList.add(Carolynn);
        personList.add(Dan);
        personList.add(Eric);
        personList.add(Joe);
        personList.add(Katrice);
        personList.add(Lawrence);
        personList.add(Luis);
    }
    @Override
    public Student[] getArray(){
        return personList.toArray(new Student[0]);
    }
}