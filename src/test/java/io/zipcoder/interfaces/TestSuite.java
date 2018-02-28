package io.zipcoder.interfaces;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)


@Suite.SuiteClasses({
       InstructorsTest.class,
        InstructorTest.class,
        PeopleTest.class,
        StudentsTest.class,
        StudentTest.class,
        TestPerson.class,
        //Run the tests in these classes independently
        //ZipCodeWilmingtonTest.class,
        //EducatorTest.class


})
public class TestSuite {
}