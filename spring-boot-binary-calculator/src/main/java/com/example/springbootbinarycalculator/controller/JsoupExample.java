package com.example.springbootbinarycalculator.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsoupExample {
   //public static void main(String[] args) {
	@GetMapping("/jsoup")
	public String Sum() {
	   String html = "<html><head><title>First parse</title></head>"
			   + 		"<body>"
			   + 			"<h1>Getting Inputs from HTML using Jsoup</h1>"
			   +          	"<div>"
			   + 				"<h2>contents are here</h2>"
			   +				"<form id=myform >"
			   +                    "<input type=number name=number1 id=number1 value=10><br>"
			   + 					"<input type=number name=number2 id=number2 value=20>"
			   + 			"</div>"
			   +    	"</body>"
			   +    "</html>";
	   
	   
			 
	   Document doc = Jsoup.parse(html);
	   Element form = doc.getElementById("myform");
	   Element input1 = form.getElementById("number1");
	   Element input2 = form.getElementById("number2");
	   
	   int num1 = Integer.parseInt(input1.attr("value"));
	   int num2 = Integer.parseInt(input2.attr("value"));
	   
	  // System.out.println("input 1: "+num1);
	  // System.out.println("input 2: "+num2);
	  // System.out.println("");
	   //System.out.println("sum of numbers: " + (num1 + num2) );
	   
	   return html+"<br>"+"sum is: "+(num1+num2);
	   
   }
}
