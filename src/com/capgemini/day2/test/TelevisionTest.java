package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.ICICI.domain.Television;

class TelevisionTest {
	Television tv;
	@BeforeEach
	void setup() {
		tv=new Television(true,50,25);
			}
	@Test
	void testIncreaseVolume() {
		assertEquals(51,tv.increaseVolume());
	}
	@Test
	void testDecreaseVolume() {
		assertEquals(49,tv.decreaseVolume());
	}
	@Test
	void teststateOfTv() {
		assertEquals(false,tv.stateOfTv());
	}
	@Test
	void channelChange() {
		assertEquals(45,tv.channelChange(45));
	}
	@AfterEach
		void tearDown() {
			tv = null;
		} 
	
		
	}

