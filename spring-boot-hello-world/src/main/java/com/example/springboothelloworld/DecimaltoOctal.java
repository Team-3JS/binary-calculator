package com.codacum.springboothelloworld;


public class DecimaltoOctal {
	public String converttoOctal(int number) {
		
		String octal;
		octal = Integer.toOctalString(number);
		return octal;
	}
	
	/*public static void main(String args[]) {
		DecimaltoOctal dto = new DecimaltoOctal();
		
		String octal = dto.converttoOctal(520);
		
		System.out.println(octal);
	}*/
}
