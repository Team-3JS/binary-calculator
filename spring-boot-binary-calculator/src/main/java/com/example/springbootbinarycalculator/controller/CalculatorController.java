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
                      @RequestParam("operator") String operator) {

        String result = "";

        if(operator.equals("addition")){
            result = BinaryCalculations.binaryAdd(firstOperand, secondOperand);
        } else if(operator.equals("subtraction")){
            result = BinaryCalculations.binarySubtract(firstOperand, secondOperand);
        } else if(operator.equals("multiplication")){
            result = BinaryCalculations.binaryMultiply(firstOperand, secondOperand);
        } else if(operator.equals("division")){
            result = BinaryCalculations.binaryDivide(firstOperand, secondOperand);
        }

        return result;
    }


}
