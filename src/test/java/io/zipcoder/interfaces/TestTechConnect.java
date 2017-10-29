package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

public class TestTechConnect {
	
	@Before
	public void setup(){	
	
	TechConnect.removeStudents();
	
	
}

@Test
public void testremoveStudents(){
	
	TechConnect.studentList.isEmpty();
}

@Test
public void testrecruitStudent(){
	
	//given
	Student student = new Student("Julia");
	
	//when
	TechConnect.studentList.contains(student);

}
}


