package com.example.springboothelloworld;

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
}
