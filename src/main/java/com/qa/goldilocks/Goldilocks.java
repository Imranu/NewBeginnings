package com.qa.goldilocks;

import java.util.Arrays;

public class Goldilocks {

	public String goldilocks(int weight, int maxTemp, int[][] seatCapTemp) {

		String output = "";

		for (int i = 0; i < seatCapTemp.length; i++) {
			int [] place = seatCapTemp[i];
			if (seatCapTemp.length <= 1) {
				if (Arrays.toString(seatCapTemp[0]) == "[]") {
					return "Seat list empty";
				}
			}
			if (weight < place[0] && maxTemp > place[1]) {
				output += i + 1 + " ";
			}
		}

		if (output.isEmpty()) {
			return "NONE";
		} else {
			return output;
		}

	}
	
}
