package com.example.springbootbinarycalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
public class BinaryCalculationsTest 
{
    @Test
    public void testConvert(){
        String result = BinaryCalculations.convert("1101", 2, 16);
        assertEquals(result, "d");
    }

}
