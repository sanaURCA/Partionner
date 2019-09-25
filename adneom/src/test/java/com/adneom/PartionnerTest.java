package com.adneom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PartionnerTest<T> {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{Arrays.asList(1, 2, 3, 4, 5),1, Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5))},
			{Arrays.asList(1, 2, 3, 4, 5),2,Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4), Arrays.asList(5))},
			{Arrays.asList(1, 2, 3, 4, 5),3,Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5))},
			{Arrays.asList(1, 2, 3, 4, 5),8,Arrays.asList(Arrays.asList(1,2,3,4,5))}	
		});
	}
	
	@Parameterized.Parameter(0)
	public List<T> list;
	@Parameterized.Parameter(1)
	public int partitionSize;
	@Parameterized.Parameter(2)
	public List<List<T>> newList;
	

	@Test
	public void should_return_list_when_partitionSize() {
		assertEquals(newList, Partionner.partition(list, partitionSize));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void throw_exception_when_list_is_null() {
		List<Integer> list = null;
		Partionner.partition(list, 2);
	}
	
	@Test
	public void should_return_empty_list_when_list_is_empty() {
		 List<List<Integer>> emptyList = Partionner.partition(new ArrayList<>(), 1);
		 assertTrue(emptyList.isEmpty());
	}
}
