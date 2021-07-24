package io.zipcoder.interfaces;

public class Person {
    final Long id;
    String name;

    Person(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id; //cant this.id =  id cuz final
    }

    public String getName() {
        return name;
    }

   //public Long setId(){ this.id = id; } //cant set this.id = id cuz final

    public String setName() {
       return this.name = name;
    }
}
