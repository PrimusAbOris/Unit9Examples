package com.coderscampus;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {
  public static void main(String[] args) {
	List<Integer> numbers = new LinkedList<>();
	
	// LinkedList
	// ******     Head=1     ******     Head=0
	// ******  ** Tail=0 <------------> Tail=1
	// ******      (20)       ****       (40)
	
	for (int i = 0; i <= 5; i++) {
		numbers.add(i * 10);
	}
	
	printListToConsole(numbers);
	
	numbers.remove(2);  // 20
	printListToConsole(numbers);
	
	// numbers.remove(20); // error, index out of bounds
	
	numbers.remove((Integer)30);
	printListToConsole(numbers);
  }
  
  private static void printListToConsole(List<Integer> elements) {
		for (Integer element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}
}

