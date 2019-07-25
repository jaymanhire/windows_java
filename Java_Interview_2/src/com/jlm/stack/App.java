package com.jlm.stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) {

		// Stack: can only push and pop on and off the stack

		Stack<String> deckOfCards = new Stack<String>();

		String card1 = "Jack : Diamonds";
		String card2 = "8 : Hearts";
		String card3 = "3 : Clubs";

		deckOfCards.push(card1);
		deckOfCards.push(card2);
		deckOfCards.push(card3);

		System.out.println(deckOfCards);

		String top = deckOfCards.peek();
		System.out.println(top);

		System.out.println(deckOfCards.size());

		System.out.println();

		while (!deckOfCards.isEmpty()) {
			String removedItem = deckOfCards.pop();
			System.out.println("Removed Item: " + removedItem);
		}

	}

}
