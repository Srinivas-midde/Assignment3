package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.ICICI.domain.President;

class PresidentTest {

	@Test
	void test() {

		assertEquals(5564.0,President.calSalary(2500 , 8),1);
	}

}
