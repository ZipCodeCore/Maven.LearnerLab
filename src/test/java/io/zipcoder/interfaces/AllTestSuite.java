package io.zipcoder.interfaces;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestPerson.class,
        StudentTest.class,
        InstructorTest.class,
        PeopleTest.class,
        StudentsTest.class,
        InstructorsTest.class
})

public class AllTestSuite {
}
