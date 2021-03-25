package io.zipcoder.interfaces;

import java.util.Objects;

public class Person {
    final long id;
    String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        return getId() == person.getId() &&
//                getName().equals(person.getName());
//    }
//
////    @Override
////    public int hashCode() {
////        return Objects.hash(getId(), getName());
////    }

    public void setName(String name) {
        this.name = name;
    }

}
