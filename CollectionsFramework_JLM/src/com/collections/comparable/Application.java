package com.collections.comparable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// ArrayLists allow dupes! Sets do not!
		HashSet<Integer> list1 = new HashSet<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		// Convert HashSet into a ArrayList
		List<Integer> li = new ArrayList<Integer>(list1);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(67);
		newList.add(15);
		//list1.clear();
		boolean hasValue = list1.retainAll(newList);
		System.out.println(li);
		
		
		//list1.addAll(newList);		
		//list1.removeAll(newList);
		//list1.clear();
		
		System.out.println(list1);

	}

}
