
public class Runner {
	public static void main(String[] args) {

		Dog d1 = new Dog();

		d1.bark("s");

		MyArray myArray1 = new MyArray();
		MyArray myArray2 = new MyArray();
		MyArray myArray3 = new MyArray();

		myArray1.fillArray();
		myArray2.fillArray();
		myArray3.fillArray();

		myArray1.removeFromArray();

		System.out.println(myArray1.a1);

		System.out.println(myArray2.a1);

		System.out.println(myArray3.a1);

	}
}
