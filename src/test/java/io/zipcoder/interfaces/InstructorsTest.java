package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {


    @Test
    public void getInstance () {
        Assert.assertEquals("Dolio", Instructors.getInstance().findById(75).getName());
        Assert.assertEquals("Kris", Instructors.getInstance().findById(74).getName());
        Assert.assertEquals("Christopher", Instructors.getInstance().findById(73).getName());
        Assert.assertEquals("Roberto", Instructors.getInstance().findById(72).getName());
        Assert.assertEquals("Froilan", Instructors.getInstance().findById(71).getName());

    }
}