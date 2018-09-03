package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.ICICI.domain.SalesManager;

class SalesManagerTest {

	@Test
	void test() {
		assertEquals(4100.0,SalesManager.calSalary(2500),1);
	}

}
