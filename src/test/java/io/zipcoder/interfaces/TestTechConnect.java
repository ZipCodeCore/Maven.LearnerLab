package io.zipcoder.interfaces;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTechConnect {

	@Before
	public void setUp(){		
		TechConnect.removeStudents();
	}

	@Test
	public void testRemoveStudents() {
	
	
	Assert.assertTrue(TechConnect.getStudents().isEmpty());
	
	}
	
	@Test
	public void testRecruitStudent() {
		
		//if
		Student someStudent = new Student("someStudent");
		Student someOtherOne= new Student("someOtherOne");

        //when
		
		TechConnect.recruitStudent(someStudent);
		TechConnect.recruitStudent(someOtherOne);

	    double actual = TechConnect.getStudents().size();
				
        double expected = 2;


        //Assert

        Assert.assertEquals(expected,  actual, 0);

        
	}

}