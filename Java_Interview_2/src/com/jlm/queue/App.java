package com.jlm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		
		// Queueus shine in FIFO situations
		Queue<String> queue = new LinkedList<String>();
		
		// Enqueue items, Dequeue to remove
		queue.add("Sam");
		queue.add("Anna");
		queue.add("Heidi");
		queue.add("Susan");
		queue.add("Charlotte");
		
		System.out.println(queue);
		String nextInQueue = queue.peek();
		System.out.println("Next up! " + nextInQueue);
		
		/*
		for(int i = 0; i < queue.size(); i++) {
			queue.remove();
			System.out.println(queue);
		}
		*/
		
		String recentlyRemoved = queue.remove();
		System.out.println("Recently Removed: " + recentlyRemoved);
		System.out.println(queue);
		

	}

}
