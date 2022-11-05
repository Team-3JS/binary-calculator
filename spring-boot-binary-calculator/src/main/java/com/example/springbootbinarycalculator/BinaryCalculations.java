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

    public static String Add(String Num1, String Num2, int base){
        String result;
        int integerResult = Integer.parseInt(Num1, base) + Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String Subtract(String Num1, String Num2, int base){
        String result;
        int integerResult = Integer.parseInt(Num1, base) - Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String Multiply(String Num1, String Num2, int base){
        String result;
        int integerResult = Integer.parseInt(Num1, base) * Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String Divide(String Num1, String Num2, int base){
        String result;
        if(Integer.parseInt(Num2) == 0)
            return "Cannot divide by zero";

        int integerResult = Integer.parseInt(Num1, base) / Integer.parseInt(Num2, base);
        result = Integer.toString(integerResult ,base);
        return result;
    }

    public static String toString(String Num, int origBase, int newBase){
        return Integer.toString(Integer.parseInt(Num, origBase), newBase);
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
