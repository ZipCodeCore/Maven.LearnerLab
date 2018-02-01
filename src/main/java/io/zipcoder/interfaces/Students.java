package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE=new Students();


    private Students(){

        String[] listOfStudentNames =
                        {"Aaron Herion", "Abrar Mohammed", "Andrea Susnick",
                        "Andrew Kutchen", "Brian Sutton", "Claude McAlpin",
                        "Donald Fountain", "Elliot Kozulak", "Gabriela Lisboa",
                        "Graham Nilsen", "Greg Patselas", "Jeff Lawrence",
                        "Katherine Anderson", "Lina Zhang", "Linda Qiu",
                        "Logan Hanner", "Merin Jose", "Oleg Stirbu",
                        "Pavel Parfenov", "Raul Cubila Perez", "Rob Kruzel",
                        "Ryan Maiale", "Samuel Haile", "Timothy Rager",
                        "Vince Paris", "Wesley Connors", "Zan Cheema",
                        "Zachary Stimmel"};

            int i=0;
            for (String s : listOfStudentNames)
            {
                this.add(new Student(i, s));
                i++;
            }
        
        }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray(){
        return this.personList.toArray(new Student[INSTANCE.personList.size()]);
    }
}