package delete;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	static int a = 9;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(9);
		System.out.println("----------------------------------------");
		basicPrint();
		printLine();
		assignAVariableAndPrint();
		printLine();
		takeAParameterAndPrint(987);
		printLine();
		method4(987);
		printLine();
		method5(987);
		printLine();
		System.out.println(returningAValue());
		printLine();
		datatypes();
		printLine();
		strings();
		printLine();
		// Also Overloading
		datatypes(10);
		printLine();
		conditionals(4);
		printLine();
		conditionals2();
		printLine();
		conditionals3();
		printLine();
		conditionalsWithSwitch();
		printLine();
		iteration1();
		printLine();
		whileIteration();
		printLine();
		arrayMethod();
		printLine();
		listMethod();
		printLine();
		listMethodWithStream();
		printLine();
		System.out.println(moreStreams());
		printLine();
		streamsWithStrings("Bert");
	}

	public static void basicPrint() {
		System.out.println("Method 1");
	}

	public static void printLine() {
		System.out.println("----------------------------------------");
	}

	public static void assignAVariableAndPrint() {

		int a = 10;
		System.out.println(a);
	}

	public static void takeAParameterAndPrint(int exampleInput) {
		System.out.println(exampleInput);
	}

	public static void method4(int exampleInput) {
		exampleInput++;
		System.out.println(exampleInput);
	}

	public static void method5(int exampleInput) {
		exampleInput--;
		exampleInput--;
		method4(exampleInput);
	}

	public static int returningAValue() {
		return 7;
	}

	public static void datatypes() {

		boolean bool = true;
		int number = 9;
		double decimal = 10.9;
		float smallDecimal = 99.089F;
		char character = 'a';

		System.out.println(bool);
		System.out.println(number);
		System.out.println(decimal);
		System.out.println(smallDecimal);
		System.out.println(character);

	}

	private static void strings() {
		String refVar = "This is a String - notice the \" ";
		System.out.println(refVar);
	}

	public static void datatypes(int inputA) {

		char character = 'a';

		System.out.println(character + inputA);

	}

	public static void conditionals(int inputA) {

		if (inputA > 5) {
			System.out.println(inputA + " Greater than 5 - Do something");
		} else {
			System.out.println(inputA + " Not greater than 5 - Do something different");
		}

	}

	public static void conditionals2() {

		// If this entire condition evaluates to True then execute it
		if (10 > 8 && 9 > 8 && 9 < 11) {
			System.out.println("Executes");
		} else {
			System.out.println("Does not execute");
		}

	}

	public static void conditionals3() {

		// If this entire condition evaluates to True then execute it
		if (10 > 8 && 9 > 18 && 9 < 11) {
			System.out.println("Executes");

		} else if (true) {
			System.out.println("Will always execute");
		} else {
			System.out.println("Do not execute");
		}

	}

	public static void conditionalsWithSwitch() {

		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not a day");
			break;
		}

	}

	public static void iteration1() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

	public static void whileIteration() {

		int catCount = 0;
		boolean notEnoughCats = true;

		while (notEnoughCats) {

			System.out.println("Another cat");
			catCount++;

			if (catCount > 273)
				notEnoughCats = false;
		}

		System.out.println("Gareth has too many cats");

	}

	public static void arrayMethod() {
		int[] arrayOfInts = { 5, 6, 7, 8, 9 };
		int[] aDiffArrayOfInts = new int[1];

		// What's this?
		System.out.println(arrayOfInts);
		System.out.println(aDiffArrayOfInts);

//		arrayOfInts[3] = 5;

		for (int i : arrayOfInts) {
			System.out.println("Number at this position is " + i);
		}

	}

	public static void listMethod() {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(5);
		listOfNumbers.add(15);
		listOfNumbers.add(25);
		listOfNumbers.add(35);

		// however why does this work - see above when printing out arrays
		System.out.println(listOfNumbers);

		for (int i : listOfNumbers) {
			i = i * 10;
			System.out.println("Item of the list: " + i);
		}

	}

	public static void listMethodWithStream() {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(5);
		listOfNumbers.add(15);
		listOfNumbers.add(25);
		listOfNumbers.add(35);
		listOfNumbers.stream().forEach(i -> System.out.println(i));
		printLine();
		listOfNumbers.stream().map(i -> i * 10).forEach(i -> System.out.println(i));
	}

	public static List<Integer> moreStreams() {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

		for (int i = 10; i < 1000; i += 1) {
			listOfNumbers.add(i);
		}

		return listOfNumbers.stream().filter(i -> i % 4 == 0).map(i -> i * 9).collect(Collectors.toList());

	}

	public static void streamsWithStrings(String aName) {
		ArrayList<String> listOfNames = new ArrayList<String>();

		listOfNames.add("Bert");
		listOfNames.add("Bert");
		listOfNames.add("John");

		System.out.println(listOfNames.stream().filter(i -> i.equals(aName)).count());
	}
}
