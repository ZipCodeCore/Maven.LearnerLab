package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;

    //constructors
    public Person (long id){
        this.id = id;
    }
    public Person (String name, long id){
      this.name = name;
      this.id = id;
    }

    //getters & setters
    public long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }


}
