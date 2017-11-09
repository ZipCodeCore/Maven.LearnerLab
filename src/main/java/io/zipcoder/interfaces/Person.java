package io.zipcoder.interfaces;

public class Person {

    int agee;

    private final long id;
    private String name;

    public Person(long id) {
        this.id = id;
    }

    public Person(String name){
        this(0, name);
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId(){
        System.out.println(agee);
        return id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "agee=" + agee + ", id=" + id + ", name='" + name + '\'' + '}';
    }
}
