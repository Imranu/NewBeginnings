package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.goldilocks.Goldilocks;

public class goldilocksTest {
	
	Goldilocks test = new Goldilocks();
	
	@Test
	public void test1() {
		assertEquals("2 5 ", this.test.goldilocks(100, 80, new int[][] {{30, 50}, {130, 60}, {120, 90}, {20, 80}, {102, 70}}));
	}
	
	@Test
	public void test2() {
		assertEquals("NONE", this.test.goldilocks(150, 20, new int[][] {{1, 21}, {30, 50}}));
	}
	
	@Test
	public void test3() {
		assertEquals("Seat list empty", this.test.goldilocks(150, 20, new int[][] {{}}));
	}

}
