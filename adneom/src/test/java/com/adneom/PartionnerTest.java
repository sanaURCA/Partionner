package com.adneom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PartionnerTest {


	@Test
	public void partionnerTest() {
		List<Integer> list = Arrays.asList(1,3,4,5,8,1,4);
		List<List<Integer>> newList = Partionner.partition(list, 8);
		assertEquals(newList.get(0), Arrays.asList(1,3,4,5,8,1,4));
	}
	
	@Test
	public void partionnerAvec_2Test() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> newList = Partionner.partition(list, 2);
		assertTrue(newList.size() == 3);
		assertEquals(newList.get(0), Arrays.asList(1,2));
		assertEquals(newList.get(1), Arrays.asList(3,4));
		assertEquals(newList.get(2), Arrays.asList(5));
	}
	
	@Test
	public void partionnerAvec_3Test() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> newList = Partionner.partition(list, 3);
		assertTrue(newList.size() == 2);
		assertEquals(newList.get(0), Arrays.asList(1,2,3));
		assertEquals(newList.get(1), Arrays.asList(4,5));
	}
	
	@Test
	public void partionnerAvec_1Test() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> newList = Partionner.partition(list, 1);
		assertTrue(newList.size() == 5);
		assertEquals(newList.get(0), Arrays.asList(1));
		assertEquals(newList.get(1), Arrays.asList(2));
		assertEquals(newList.get(2), Arrays.asList(3));
		assertEquals(newList.get(3), Arrays.asList(4));
		assertEquals(newList.get(4), Arrays.asList(5));
	}
	
	@Test
	public void isListEmptyTest() {
		 List<List<Integer>> emptyList = Partionner.partition(new ArrayList<>(), 1);
		 assertTrue(emptyList.isEmpty());
	}
	
	@Test(expected = NullPointerException.class)
	public void nullPointerExceptionWhenListNullTest() {
		List<Integer> list = null;
		Partionner.partition(list, 2);
	}
}
