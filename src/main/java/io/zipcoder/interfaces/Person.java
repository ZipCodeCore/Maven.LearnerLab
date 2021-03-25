package io.zipcoder.interfaces;

public class Person
{
    private final Long id;
    private String name;


    public Person(String name, Long id)
    {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;

    }

    public Long getId()
    {
        return id;
    }


}
