package com.coderscampus;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApplication {
	public static void main(String[] args) {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();

		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		System.out.println(uniqueNumbers.add(1));

		printSetToConsole(uniqueNumbers);

		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Guy Ross");
		uniqueNames.add("Josh Someone");
		uniqueNames.add("Josh Someone Else");

		for (String element : uniqueNames) {
			System.out.println(element);
		}
	}

	private static void printSetToConsole(Set<Integer> elements) {
		for (Integer element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}
}
