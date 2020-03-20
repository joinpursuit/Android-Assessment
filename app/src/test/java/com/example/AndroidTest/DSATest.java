package com.example.AndroidTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class DSATest {

    @Test
    public void testMultiplyingInts() {
        int a = 2;
        int b = 3;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(6,output);
    }


    @Test
    public void testMultiplyingIntsTwo() {
        int a = 235;
        int b = 1;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(235,output);
    }

    @Test

    public void testMultiplyingIntsThree() {
        int a = -5;
        int b = 18;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(-90,output);
    }
}