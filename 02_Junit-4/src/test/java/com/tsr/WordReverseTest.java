package com.tsr;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class WordReverseTest {
	
	private WordReverse reverse = null;
	
	@Before
	public void init() {
		reverse = new WordReverse();
	}
	
	@After
	public void dest() {
		reverse = null;
	}
	
	@Test
	public void reverseWordTest() {
		String word = "sai";
		String expectedWord = "ias";
		String actualWord = reverse.reverseWord(word);
		assertEquals(expectedWord, actualWord);
	}
}
