package io.zipcoder.interfaces;

public class Person {

    //instance fields
    public final long id;
    String name;

    //constructor never has void
   public Person(long id){

       this.id= id;
   }

    public Person(String name, long id){
        this.name = name;
        this.id= id;
    }

    //Methods
    public long getID() {
       return this.id;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {

       this.name = name;
    }
}
