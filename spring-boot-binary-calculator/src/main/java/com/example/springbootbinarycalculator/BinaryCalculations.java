package com.example.springbootbinarycalculator;

public class BinaryCalculations 
{


    public static String binaryAdd(String binaryNum1, String binaryNum2){
        String result;
        int integerResult = Integer.parseInt(binaryNum1, 2) + Integer.parseInt(binaryNum2, 2);
        result = Integer.toBinaryString(integerResult);
        return result;
    }

    public static String binarySubtract(String binaryNum1, String binaryNum2){
        String result;
        int integerResult = Integer.parseInt(binaryNum1, 2) - Integer.parseInt(binaryNum2, 2);
        result = Integer.toBinaryString(integerResult);
        return result;
    }

    public static String binaryMultiply(String binaryNum1, String binaryNum2){
        String result;
        int integerResult = Integer.parseInt(binaryNum1, 2) * Integer.parseInt(binaryNum2, 2);
        result = Integer.toBinaryString(integerResult);
        return result;
    }

    public static String binaryDivide(String binaryNum1, String binaryNum2){
        String result;
        if(Integer.parseInt(binaryNum2) == 0)
            return "Cannot divide by zero";

        int integerResult = Integer.parseInt(binaryNum1, 2) / Integer.parseInt(binaryNum2, 2);
        result = Integer.toBinaryString(integerResult);
        return result;

    }

    public static String add(String Num1, String Num2, int base){
        String result;
        int integerResult = Integer.parseInt(Num1, base) + Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String subtract(String Num1, String Num2, int base){
        String result;
        int integerResult = Integer.parseInt(Num1, base) - Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String multiply(String Num1, String Num2, int base){
        String result;
        int integerResult = Integer.parseInt(Num1, base) * Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String divide(String Num1, String Num2, int base){
        String result;
        if(Integer.parseInt(Num2, base) == 0)
            return "Cannot divide by zero";

        int integerResult = Integer.parseInt(Num1, base) / Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String convert(String Num, int origBase, int newBase){
        return Integer.toString(Integer.parseInt(Num, origBase), newBase);
    }


}
