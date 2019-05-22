
public class Dog {

	String breed;
	double weight;
	int age;
	String name;
	String emotion;

	public void bark(String emotion) {
		System.out.println("Woof!");
		if (emotion.equals("Happy")) {
			System.out.println("Woof, woof");
		}
	}

}
