package com.example.springbootbinarycalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
public class BinaryCalculationsTest 
{
    @Test
    public void testVal()
    {
        BinaryCalculations a = new BinaryCalculations();
        String h = a.intToBinary(14);
        Assert.assertEquals("01110", h);
    }

    @Test
    public void testVal2()
    {
        BinaryCalculations a = new BinaryCalculations();
        String h = a.intToBinary(16);
        Assert.assertEquals("010000", h);
    }

    @Test
    public void testVal3()
    {
        BinaryCalculations a = new BinaryCalculations();
        String h = a.intToBinary(-10);
        Assert.assertEquals("10110", h);
    }
}
