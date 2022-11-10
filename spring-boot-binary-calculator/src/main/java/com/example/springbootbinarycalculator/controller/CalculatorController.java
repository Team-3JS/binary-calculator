package com.example.springbootbinarycalculator.controller;

import org.springframework.web.bind.annotation.*;

import com.example.springbootbinarycalculator.BinaryCalculations;
import org.springframework.web.servlet.view.RedirectView;

import javax.swing.text.html.HTMLDocument;

@RestController
public class CalculatorController {


    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    String calculator(@RequestParam("firstOperand") String firstOperand,
                      @RequestParam("secondOperand") String secondOperand,
                      @RequestParam("operator") String operator,
                      @RequestParam("base") String base) {

        int radix = 10;

        if(base.equals("hexadecimal"))
            radix = 16;
        if(base.equals("binary"))
            radix = 2;
        if(base.equals("octal"))
            radix = 8;


        String result = "";

        if(operator.equals("addition")){
            result = BinaryCalculations.add(firstOperand, secondOperand, radix);
        } else if(operator.equals("subtraction")){
           result = BinaryCalculations.subtract(firstOperand, secondOperand, radix);
        } else if(operator.equals("multiplication")){
            result = BinaryCalculations.multiply(firstOperand, secondOperand, radix);
        } else if(operator.equals("division")){
            result = BinaryCalculations.divide(firstOperand, secondOperand, radix);
        }

        return result;
    }

    @RequestMapping(value="/convert", method = RequestMethod.GET)
    String converter(@RequestParam("inputBase") String inputBase,
                     @RequestParam("outputBase") String outputBase,
                     @RequestParam("num") String num){

        String result = "";
        int inputRadix = 10;
        int outputRadix = 10;

        if(inputBase.equals("hexadecimal"))
            inputRadix = 16;
        if(inputBase.equals("binary"))
            inputRadix = 2;
        if(inputBase.equals("octal"))
            inputRadix = 8;
        if(inputBase.equals("decimal"))
            inputRadix = 10;

        if(outputBase.equals("hexadecimal"))
            outputRadix = 16;
        if(outputBase.equals("binary"))
            outputRadix = 2;
        if(outputBase.equals("octal"))
            outputRadix = 8;
        if(outputBase.equals("decimal"))
            outputRadix = 10;

        result = BinaryCalculations.convert(num, inputRadix, outputRadix);

        return result;

    }


}
