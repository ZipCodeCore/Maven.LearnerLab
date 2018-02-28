package io.zipcoder.interfaces;

public class Person {
    //I don't want anyone to be able to access, and final is a constant
    private final Long id;
    private String name;

    //the constructor, takes a long parameter and this is a ref to the current object
    public Person(Long id){
        this.id = id;
    }
    //the getId method returns a long, and its "id"
    public Long getId(){
        return this.id;
    }
    //method getName returns a string, and returns a name
    public String getName(){
        return this.name;
    }
    //method setName, doesn't return thus void and it takes a parameter..so we set the value and supply arguement
    public void setName(String name){
        this.name = name;
    }


}
