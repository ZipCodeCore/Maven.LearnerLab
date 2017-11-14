package io.zipcoder.interfaces;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestPerson.class,
        TestStudent.class,
        TestStudents.class,
        TestInstructor.class,
        TestInstructors.class,
        TestZipCodeWilmington.class,
        TestEducator.class
})

public class AllTest {
}
