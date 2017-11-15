package io.zipcoder.interfaces;

public class Students extends People{

    private static final Students INSTANCE = new Students();

    private String[] studentNames=
            {
            "Aaron Herion", "Abrar Mohammed","Andrea Susnick","Andrew Kutchen",
            "Brian Sutton", "Donald Fountain" , "Elliott Kozulak", "Gabriela Lisboa",
            "Graham Nilsen", "Greg Patselas","Jeff Lawrence", "Katherine Anderson",
            "Kevin Buckley", "Lina Zhang", "Linda Qiu", "Logan Hanner", "Merin Jose","Oleg Stirbu", "Pavel Parfenov",
            "Raul Cubila Perez", "Rob Kruzel", "Ryan Maiale", "Timothy Rager", "Vince Paris",
            "Wesley Connors","Zan Cheema"
            };

    private Students()
    {
        for(int i=0;i<studentNames.length;i++)
        {
            Person person= new Student(studentNames[i], i+1);
            personList.add(person);
        }
    }

    public static Students getInstance()
    {
        return INSTANCE;
    }

}
