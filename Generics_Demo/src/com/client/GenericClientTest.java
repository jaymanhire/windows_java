package com.client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.generic.MyGenericClass;
import com.generic.MyGenericClass_2;

public class GenericClientTest {

	public static void main(String[] args) {

		MyGenericClass<Integer> myGenericClass1 = new MyGenericClass<>();
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(101);
		list1.add(102);
		
		myGenericClass1.setList(list1);
		
		List<Integer> list = myGenericClass1.getList();
		list.forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		MyGenericClass<String> myGenericClass2 = new MyGenericClass<>();
		
		List<String> list2 = new LinkedList<>();
		list2.add("KK");
		list2.add("PK");
		list2.add("MK");
		
		myGenericClass2.setList(list2);
		myGenericClass2.getList().forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		MyGenericClass_2<Integer, String> myGenericClass22 = new MyGenericClass_2<>(1001, "KK");
		System.out.println(myGenericClass22.getKey() + "\t" + myGenericClass22.getValue());
		
		MyGenericClass_2<String, Integer> myGenericClass33 = new MyGenericClass_2<>("KK", 1001);
		System.out.println(myGenericClass33.getKey() + "\t" + myGenericClass33.getValue());
		

	}

}
