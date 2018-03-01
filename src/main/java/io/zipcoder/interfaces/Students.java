package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static Students INSTANCE;

        private Students() {

            Student Ronald = new Student(101);
            Student Darby = new Student(102);
            Student Danny = new Student(103);
            Student Lara = new Student (104);

            this.add(Ronald);
            this.add(Darby);
            this.add(Danny);
            this.add(Lara);
        }

        public static Students getINSTANCE() {
            if (INSTANCE == null) {
                INSTANCE = new Students();
            }
            return INSTANCE;
        }

        public Student[] getArray() {
            Student[] studentArray = new Student[personList.size()];
            for (int i = 0; i < personList.size(); i++) {
                studentArray[i] = personList.get(i);
            }
            return studentArray;
        }
    }
