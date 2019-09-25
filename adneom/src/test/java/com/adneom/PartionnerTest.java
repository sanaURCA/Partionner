package com.adneom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PartionnerTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void throw_exception_when_list_is_null() {
		List<Integer> list = null;
		Partionner.partition(list, 2);
	}

	@Test
	public void should_return_1345814_when_list_1345814_and_partition_size_8() {
		List<Integer> list = Arrays.asList(1,3,4,5,8,1,4);
		List<List<Integer>> newList = Partionner.partition(list, 8);
		assertTrue(newList.size() == 1);
		assertEquals(newList.get(0), Arrays.asList(1,3,4,5,8,1,4));
	}
	
	@Test
	public void should_return_12_34_5_when_list_12345_and_partition_size_2() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> newList = Partionner.partition(list, 2);
		assertTrue(newList.size() == 3);
		assertEquals(newList.get(0), Arrays.asList(1,2));
		assertEquals(newList.get(1), Arrays.asList(3,4));
		assertEquals(newList.get(2), Arrays.asList(5));
	}
	
	@Test
	public void should_return_123_45_when_list_12345_and_partition_size_3() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> newList = Partionner.partition(list, 3);
		assertTrue(newList.size() == 2);
		assertEquals(newList.get(0), Arrays.asList(1,2,3));
		assertEquals(newList.get(1), Arrays.asList(4,5));
	}
	
	@Test
	public void should_return_1_2_3_4_5_when_list_12345_and_partition_size_1(){
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
	public void should_return_empty_list_when_list_is_empty() {
		 List<List<Integer>> emptyList = Partionner.partition(new ArrayList<>(), 1);
		 assertTrue(emptyList.isEmpty());
	}
}
