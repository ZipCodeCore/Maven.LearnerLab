package io.zipcoder.interfaces;


public class Person {
	
	//instance variable
	private String name; 
	
	//constructor
	public Person(String theName)
	{
		name = theName;
	}
	
	// method to retrieve the name
	public String getName ()
	{
		return name;
	}
	
	// method to set the name
	public void setName (String theName)
	{
		name = theName;
	}
		
}
