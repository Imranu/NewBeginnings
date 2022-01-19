package com.qa.goldilocks;

import java.util.Arrays;

public class Goldilocks {

	public String goldilocks(int weight, int maxTemp, int[][] seatCapTemp) {

		String output = "";

		if (seatCapTemp.length <= 1) { // if seatCapTemp list is empty
			if (Arrays.toString(seatCapTemp[0]) == "[]") { // if it outputs [] and is empty (will always have blank entry as 2d array
				return "Seat list empty"; // output empty list message
			}
		}
		
		for (int i = 0; i < seatCapTemp.length; i++) { // iterating through each index of seatCapTemp (each possible seat)
			int [] place = seatCapTemp[i]; // returning actual value of each seat. i counting index
			if (weight <= place[0] && maxTemp >= place[1]) { // if G can sit, add seat to output
				output += i + 1 + " "; // i + 1 because index starts at 0 but seat number starts as 1
			} 
		}

		if (output.isEmpty()) { // if no G cannot sit on any seat return NONE
			return "NONE";
		} else {
			return output; // otherwise return output of possible seats
		}

	}
	
}
