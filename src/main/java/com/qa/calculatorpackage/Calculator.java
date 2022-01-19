package com.qa.calculatorpackage;

public class Calculator {

    public String calculate(int[] numberList) {
        
    	// initialising String output
    	
    	String output = "";
    	
    	// passing in int[] array
    	// extract each int[] from array, assign to new values
    	
    	int a = numberList[0];
    	int b = numberList[1];
    	int c = numberList[2];
 
    	// conditional logic
    	if (a + b == c) {
    		output += a + " + " + b + " = " + c + ". ";
    	} 
    	if (c + b == a) {
    		output += c + " + " + b + " = " + a + ". ";
    	}
    	if (a - b == c) {
    		output += a + " - " + b + " = " + c + ". ";
    	}
    	if (c - b == a) {
    		output += c + " - " + b + " = " + a + ". ";
    	}
    	if (c - a == b) {
    		output += c + " - " + a + " = " + b + ". ";
    	}
    	if (b - a == c) {
    		output += b + " - " + a + " = " + c + ". ";
    	}
    	if (a * b == c) {
    		output += a + " * " + b + " = " + c + ". ";
    	}
    	if (c * b == a) {
    		output += c + " * " + b + " = " + a + ". ";
    	}
    	if (a / b == c) {
    		output += a + " / " + b + " = " + c + ". ";
    	}
    	if (b / a == c) {
    		output += b + " / " + a + " = " + c + ". ";
    	}
    	if (c / b == a) {
    		output += c + " / " + b + " = " + a + ". ";
    	}
    	if (b / c == a) {
    		output += b + " / " + c + " = " + a + ". ";
    	}
    	if (a / c == b) {
    		output += a + " / " + c + " = " + b + ". ";
    	}
    	if (c / a == b) {
    		output += c + " / " + a + " = " + b + ". ";
    	} 
    	if (output == "") {   	
    	output = "None";
    	}
    	
    	//return output
    	return output;
    }

}
