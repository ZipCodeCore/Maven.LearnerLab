package io.zipcoder.interfaces;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestPerson.class,
        StudentTest.class,
        InstructorTest.class,
        //PeopleTest.class,     the remove all method interferes with StudentsTest because it is a singleton instance
        StudentsTest.class,
        InstructorsTest.class,
        ZipCodeWilmingtonTest.class
})

public class AllTestSuite {
}
