package com.example.springbootbinarycalculator;

public class BinaryCalculations 
{
    public String intToBinary(int a)
    {
        if(a > 0)
        {
            int b = a;
            String retval = "";
            while(b!= 0)
            {
                if(b %2 == 1)
                {
                    retval = "1" + retval;
                    b--;
                    b/=2;
                }
                else
                {
                    retval = "0" + retval;
                    b/=2;
                }
            }
            retval = "0" + retval;
            return retval;
        }
        else if(a < 0)
        {
            int b = a * -1;
            int firstval = 1;
            int places = 1;
            while(firstval< b)
            {
                places ++;
                firstval*=2;
            }

            b = firstval - b;
            String retval = "";
            while(b!= 0)
            {
                if(b %2 == 1)
                {
                    retval = "1" + retval;
                    b--;
                    b/=2;
                }
                else
                {
                    retval = "0" + retval;
                    b/=2;
                }
            }

            while(retval.length() < places -1)
            {
                retval = "0" + retval;
            }

            retval = "1" + retval;
            return retval;

        }
        else
        {
            return "00";
        }
    }

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

     /*
    public static void main(String[] args)
    {
        BinaryCalculations a = new BinaryCalculations();
        String h = a.intToBinary(14);

        if(h.equals("01110"))
        {
            System.out.println("correct test");
        }
        else
        {
            throw new RuntimeException("error in test");
        }

        String h2 = a.intToBinary(16);

        if(h2.equals("010000"))
        {
            System.out.println("correct test");
        }
        else
        {
            throw new RuntimeException("error in test");
        }

        String h3 = a.intToBinary(-10);

        if(h3.equals("10110"))
        {
            System.out.println("correct test");
        }
        else
        {
            throw new RuntimeException("error in test");
        }
        
    }
    */
}