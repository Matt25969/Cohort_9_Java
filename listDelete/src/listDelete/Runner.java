package listDelete;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<Integer>();
		question1(numberList);
		System.out.println(numberList);
		System.out.println(question2(numberList, 0));

		ArrayList<String> stringList = new ArrayList<String>();
		question3(stringList);
		System.out.println(stringList);
		System.out.println(question3b(stringList, "Bert"));

		System.out.println(question4(numberList));

		System.out.println(question6(stringList, "Num4"));

		question7(numberList);

		System.out.println(question8(numberList).get());

		System.out.println(question9(numberList));

		System.out.println(question10(numberList));

	}

	public static void question1(ArrayList<Integer> numberList) {
		for (int i = 0; i < 11; i++) {
			numberList.add(i);
		}

		numberList.add(1);
		numberList.add(100);

	}

	public static boolean question2(ArrayList<Integer> numberList, int input) {
		return numberList.contains(input);

	}

	public static void question3(ArrayList<String> stringList) {
		for (int i = 0; i < 11; i++) {
			stringList.add("Num" + i);
		}
		stringList.add("Num4");

	}

	public static boolean question3b(ArrayList<String> stringList, String input) {
		return stringList.contains(input);

	}

	public static List<Integer> question4(ArrayList<Integer> numberList) {

		return numberList.stream().map(i -> i *= (i % 5 == 0) ? 10 : 1).collect(Collectors.toList());

	}

	// this is actually 5!!
	public static int question6(ArrayList<String> stringList, String input) {
		return (int) stringList.stream().filter(s -> s.equals(input)).count();
	}

	public static void question7(ArrayList<Integer> numberList) {

		System.out.println(numberList.stream().mapToInt(i -> i.intValue()).sum());
	}

	public static Optional<Integer> question8(ArrayList<Integer> numberList) {

		return numberList.stream().max(Integer::compare);
	}

	public static List<Integer> question9(ArrayList<Integer> numberList) {

		return numberList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	public static List<Integer> question10(ArrayList<Integer> numberList) {

		return numberList.stream().sorted().collect(Collectors.toList());
	}

}
