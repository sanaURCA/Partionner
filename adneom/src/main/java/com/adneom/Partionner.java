package com.adneom;

import java.util.ArrayList;
import java.util.List;

public class Partionner {
	
static <T> List<List<T>> partition(List<T> list, int partitionSize) {
		checkArguments(list, partitionSize);
		List<List<T>> newList = new ArrayList<List<T>>(); 
		if (partitionSize == 0) 
			 newList.add(list);
		else {
		int length =  list.size() ; 
		for(int i= 0 ; i<  length; i+=partitionSize) {
			newList.add(new ArrayList<T>(
		            list.subList(i, Math.min(length, i + partitionSize)))
		        );
		}
		}
		return newList;
	}

static <T> void checkArguments(List<T> list, int partitionSize) {
	if(list == null)
		throw new IllegalArgumentException();
	if(partitionSize <= 0)
		throw new IllegalArgumentException();
}
}
