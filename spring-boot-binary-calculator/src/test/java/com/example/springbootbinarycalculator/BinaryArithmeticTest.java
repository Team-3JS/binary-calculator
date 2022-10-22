package com.example.springbootbinarycalculator;

import org.junit.*;

public class BinaryArithmeticTest {

    @Test
    public void testAdd(){
        String res = BinaryCalculations.binaryAdd("0100", "0010");
        Assert.assertEquals("110", res);
    }
    @Test
    public void testAdd2(){
        String res = BinaryCalculations.binaryAdd("11010110", "1111");
        Assert.assertEquals("11100101", res);
    }

    @Test
    public void testAdd3() {
        String res = BinaryCalculations.binaryAdd("0", "0");
        Assert.assertEquals("0", res);
    }

    @Test
    public void testSub() {
        String res = BinaryCalculations.binarySubtract("110", "010");
        Assert.assertEquals("100", res);
    }

    @Test
    public void testMult() {
        String res = BinaryCalculations.binaryMultiply("1000", "10");
        Assert.assertEquals("10000", res);
    }

    @Test
    public void testDivide() {
        String res = BinaryCalculations.binaryDivide("0", "0");
        Assert.assertEquals("Cannot divide by zero", res);
    }

    @Test
    public void testDivide2() {
        String res = BinaryCalculations.binaryDivide("100", "10");
        Assert.assertEquals("10", res);
    }
}
