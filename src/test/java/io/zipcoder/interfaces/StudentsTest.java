package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {


        @Test
        public void getInstance () {
            Assert.assertEquals("Malcolm", Students.getInstance().findById(44).getName());
            Assert.assertEquals("Charlotte", Students.getInstance().findById(17).getName());
            Assert.assertEquals("Chung", Students.getInstance().findById(16).getName());
            Assert.assertEquals("Val", Students.getInstance().findById(6).getName());
            Assert.assertEquals("Grace", Students.getInstance().findById(9).getName());
            Assert.assertEquals("Manny", Students.getInstance().findById(3).getName());
            Assert.assertEquals("Eddie", Students.getInstance().findById(15).getName());
        }
    }
