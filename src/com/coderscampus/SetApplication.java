package com.coderscampus;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApplication {
	// A list for one specific data type, with no duplicates
	// Set is an interface
	public static void main(String[] args) {
		Set<PersonDrei> people = new HashSet<>();

		people.add(new PersonDrei(111111111, "Trevor", "Page"));
		people.add(new PersonDrei(111111111, "Trevor", "Page"));
		people.add(new PersonDrei(111111112, "Trevor", "Page"));

		for (PersonDrei PersonDrei : people) {
			System.out.println(PersonDrei);
		}

	  example1();
	}

	private static void example1() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		
		//Since add returns a boolean, this tests if they can be added to the set
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		System.out.println(uniqueNumbers.add(1));
		
		uniqueNumbers.add(1);
		uniqueNumbers.add(2);
		uniqueNumbers.add(3);
		uniqueNumbers.add(4);
		uniqueNumbers.add(5);
		uniqueNumbers.add(6);

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