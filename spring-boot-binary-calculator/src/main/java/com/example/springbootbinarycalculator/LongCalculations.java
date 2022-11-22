package com.example.springbootbinarycalculator;

public class LongCalculations {
    public static String add(String Num1, String Num2, int base){
        String result;
        Long LongResult = Long.parseLong(Num1, base) + Long.parseLong(Num2, base);
        result = Long.toString(LongResult ,base);
        return result;
    }

    public static String subtract(String Num1, String Num2, int base){
        String result;
        Long LongResult = Long.parseLong(Num1, base) - Long.parseLong(Num2, base);
        result = Long.toString(LongResult ,base);
        return result;
    }

    public static String multiply(String Num1, String Num2, int base){
        String result;
        Long LongResult = Long.parseLong(Num1, base) * Long.parseLong(Num2, base);
        result = Long.toString(LongResult ,base);
        return result;
    }

    public static String divide(String Num1, String Num2, int base){
        String result;
        if(Long.parseLong(Num2, base) == 0)
            return "Cannot divide by zero";

        Long LongResult = Long.parseLong(Num1, base) / Long.parseLong(Num2, base);
        result = Long.toString(LongResult ,base);
        return result;
    }

    public static String convert(String Num, int origBase, int newBase){
        return Long.toString(Long.parseLong(Num, origBase), newBase);
    }

    public static boolean isInputValid(String num, int base){
        try{
            Long.parseLong(num, base);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
