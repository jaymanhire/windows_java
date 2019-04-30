package com.generic;

public class MyGenericClass_2<K, V> {

	private K key;
	private V value;

	public MyGenericClass_2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
