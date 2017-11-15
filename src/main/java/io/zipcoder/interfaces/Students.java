package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People<Student>{
    private static final Students INSTANCE = new Students();
    public String[] names={"Aaron Herion", "Abrar Mohammed","Andrea Susnick","Andrew Kutchen",
            "Brian Sutton","Claude McAlpin", "Donald Fountain" , "Elliott Kozulak", "Gabriela Lisboa",
            "Graham Nilsen", "Greg Patselas","Jeff Lawrence", "Katherine Anderson",
            "Kevin Buckley", "Lina Zhang", "Linda Qiu", "Logan Hanner", "Merin Jose","Oleg Stirbu", "Pavel Parfenov",
            "Raul Cubila Perez", "Rob Kruzel", "Ryan Maiale", "SAMUEL HAILE", "Timothy Rager", "Vince Paris",
            "Wesley Connors","Zan Cheema"};
    private Students(){
        for(int i=0;i<names.length;i++){
            Student person= new Student(i+1,names[i],0);
            personList.add(person);
        }
    }
    //making this method static because we can't instantiate the constructor
    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] getArray() {
        return super.personList.toArray(new Student[personList.size()]);
    }
}