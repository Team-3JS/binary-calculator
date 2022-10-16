package com.example.springboothelloworld;

public class BinaryCalculations 
{
    public String intToBinary(int a)
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

    /* 
    public static void main(String[] args)
    {
        BinaryCalculations a = new BinaryCalculations();
        String h = a.intToBinary(14);

        if(h == "01110")
        {
            System.out.println("correct test");
        }
        else
        {
            throw new RuntimeException("error in test");
        }

        String h2 = a.intToBinary(16);

        if(h == "010000")
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
