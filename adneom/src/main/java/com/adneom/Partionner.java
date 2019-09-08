package com.adneom;

import java.util.ArrayList;
import java.util.List;

public class Partionner {
	
static <T> List<List<T>> partition(List<T> list, int n) {
		
		List<List<T>> newList = new ArrayList<List<T>>(); 
		if (n ==0) 
			 newList.add(list);
		else {
		int length =  list.size() ; 
		for(int i= 0 ; i<  length; i+=n) {
			newList.add(new ArrayList<T>(
		            list.subList(i, Math.min(length, i + n)))
		        );
		}
		}
		return newList;
	}
}
