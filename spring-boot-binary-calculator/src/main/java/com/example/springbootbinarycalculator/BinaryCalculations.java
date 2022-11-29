package com.example.springbootbinarycalculator;

import java.util.ArrayList;

public class BinaryCalculations
{

    public static ArrayList<String> memory = new ArrayList<String>();


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

    public static boolean isInputValid(String num, int base){
        try{
            Integer.parseInt(num, base);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }


    public static void addToMem(String base, String input1, String input2, String operation, String result)
    {

        memory.add(base + ": " + input1+" "+operation+" "+ input2+" = "+ result);

        while(memory.size() > 10)
        {
            memory.remove(0);
        }


    }

    public static String getMemory(){

        if(memory.isEmpty())
            return "";

        String ret = "";
        for(int i = 0; i< memory.size(); i++)
        {
            ret+= memory.get(i) + " \n";
        }
        return ret;
    }
}

