package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testSingleton() {
        ZipCodeWilmington.hostLecture(Long.valueOf(1), 350.0);
        Map<Student, Double> map =  ZipCodeWilmington.getStudyMap();
        StringBuilder output = new StringBuilder();
        for (Student student: map.keySet()) {
            output.append(String.format("%s\t%s\n",student.getName(), map.get(student)));
        }
        String actual = output.toString();
        String expected = "student31\t10.0\n" +
                "student17\t10.0\n" +
                "student27\t10.0\n" +
                "student8\t10.0\n" +
                "student34\t10.0\n" +
                "student4\t10.0\n" +
                "student10\t10.0\n" +
                "student20\t10.0\n" +
                "student29\t10.0\n" +
                "student28\t10.0\n" +
                "student21\t10.0\n" +
                "student32\t10.0\n" +
                "student0\t10.0\n" +
                "student25\t10.0\n" +
                "student2\t10.0\n" +
                "student15\t10.0\n" +
                "student13\t10.0\n" +
                "student22\t10.0\n" +
                "student3\t10.0\n" +
                "student1\t10.0\n" +
                "student24\t10.0\n" +
                "student11\t10.0\n" +
                "student9\t10.0\n" +
                "student23\t10.0\n" +
                "student16\t10.0\n" +
                "student7\t10.0\n" +
                "student14\t10.0\n" +
                "student30\t10.0\n" +
                "student6\t10.0\n" +
                "student12\t10.0\n" +
                "student26\t10.0\n" +
                "student33\t10.0\n" +
                "student19\t10.0\n" +
                "student18\t10.0\n" +
                "student5\t10.0\n";
        Assert.assertEquals(expected, actual);
    }
}
