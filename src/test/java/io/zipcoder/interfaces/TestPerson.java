package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
	
	  @Test

	    public void testSetName(){

	        //if

	        Person somePerson = new Person("Nashae");

	        String expectedName = "Shae";

	        //when

	 
	      somePerson.setName("Shae");
	      String actualName = somePerson.getName();


	        //Assert

	        Assert.assertEquals(expectedName,  actualName);

	        

	    }
	  
	  
	   public void testConstructor(){

	        //if

	        Person somePerson = new Person("Nashae");

	        String expectedName = "Shae";

	        //when

	 
	        somePerson.setName("Shae");
	        String actualName = somePerson.getName();


	        //Assert

	        Assert.assertEquals(expectedName,  actualName);

	        

	    }
}
