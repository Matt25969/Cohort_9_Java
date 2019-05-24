import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Apple ap1 = new Apple();

		Pen p1 = new Pen();

//		ap1.printout();
//		p1.printout();

		name(p1);

		ArrayList<Printable> printList = new ArrayList<Printable>();

		printList.add(p1);
		printList.add(ap1);

		System.out.println(printList);

		for (Printable p : printList) {

			p.printout();

		}

	}

	public static void name(Printable print) {

		print.printout();

	}

}
