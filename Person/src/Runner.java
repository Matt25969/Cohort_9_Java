
public class Runner {

	public static void main(String[] args) {

		PersonManager pm1 = new PersonManager();

//		pm1.getPersonList().add(p1);
//		pm1.getPersonList().add(p2);
//		System.out.println(pm1.getPersonList());

		Child c1 = new Child("kjhg", 876, "!k");

		System.out.println(c1.printOutDetail());

		System.out.println(c1.myAbstractMethod());
	}

}
