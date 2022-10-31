package com.example.springbootbinarycalculator.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbinarycalculator.BinaryCalculations;

@RestController
public class CalculatorController {

	
	@RequestMapping(value = "/calculateServlet", method = RequestMethod.POST)
	public String calculate(@RequestParam String first_operand, String operators, String second_operand) {
		
		String result = "";
		
		if(operators.equals("addition"))
			result = BinaryCalculations.binaryAdd(first_operand, second_operand);
		
		
		return result;
	}
	
}




