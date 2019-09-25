package com.adneom;

import java.util.ArrayList;
import java.util.List;

public class Partionner {
	
static <T> List<List<T>> partition(List<T> listToSplit, int partitionSize) {
		checkArguments(listToSplit, partitionSize);
		List<List<T>> listAfterPartition = new ArrayList<List<T>>(); 
		if (partitionSize == 0) 
			listAfterPartition.add(listToSplit);
		else {
		int listeSize =  listToSplit.size() ; 
		for(int i= 0 ; i<  listeSize; i+=partitionSize) {
			listAfterPartition.add(new ArrayList<T>(
					listToSplit.subList(i, Math.min(listeSize, i + partitionSize)))
		        );
		}
		}
		return listAfterPartition;
	}

static <T> void checkArguments(List<T> list, int partitionSize) {
	if(list == null)
		throw new IllegalArgumentException();
	if(partitionSize < 0)
		throw new IllegalArgumentException();
}
}
