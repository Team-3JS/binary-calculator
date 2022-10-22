package com.example.springbootbinarycalculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.primitives.Bytes;
import org.apache.commons.text.WordUtils;
import org.apache.commons.math3.fraction.Fraction;
import java.util.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/guava-example")
    public String guavaExample(){
        byte[] myArray = {1, 2, 3};
        Bytes.reverse(myArray);
        String result = "";
        for (int i=0; i<3; i++){
            result = result + myArray[i] + " ";
        }

        return result;
    }

    @GetMapping("/api/rand")
    public String api2()
    {
        Random r = new Random();
        double randomValue = 1 * r.nextDouble();
        Fraction a = ToFraction(randomValue);
        String retval = a.toString();
        return "<div class=\"center\" align=\"center\">" + "<h1>Here's a random fraction: " +  randomValue + " = " + retval + "</h1>";
    }

    @GetMapping("/commons-example")
    public String commonsExample() {
        String toBeCapitalized = "cal poly pomona";
        String capitalizedResult = WordUtils.capitalize(toBeCapitalized);
        return toBeCapitalized + " capitalized into " + capitalizedResult;

    }

    public static Fraction ToFraction(double randomValue)
    {
        Fraction fraction = new Fraction(randomValue);
        return fraction;
    }

    public static String intToBinary(int a){
        if(a > 0){
            int b = a;
            String retval = "";
            while(b!= 0){
                if(b %2 == 1){
                    retval = "1" + retval;
                    b--;
                    b/=2;
                }
                else{
                    retval = "0" + retval;
                    b/=2;
                }
            }
            retval = "0" + retval;
            return retval;
        }
        else if(a < 0){
            int b = a * -1;
            int firstval = 1;
            int places = 1;
            while(firstval< b){
                places ++;
                firstval*=2;
            }

            b = firstval - b;
            String retval = "";
            while(b!= 0){
                if(b %2 == 1){
                    retval = "1" + retval;
                    b--;
                    b/=2;
                }
                else{
                    retval = "0" + retval;
                    b/=2;
                }
            }

            while(retval.length() < places -1){
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
}
