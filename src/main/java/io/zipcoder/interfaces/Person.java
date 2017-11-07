package io.zipcoder.interfaces;





public class Person {

    //instance fields
    final long id;
    String name;

    //constructor never has void
   public Person(long id){

       this.id = id;
    }

    //Methods
    public long getID() {
       return this.id;
    }





    public String getName()
    {
        return name;
    }


    public void  setName(String name)
    {

        this.name = name;
    }
}









