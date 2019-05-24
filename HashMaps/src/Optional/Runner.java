package Optional;

public class Runner {

	public static void main(String[] args) {

		OptionalPersonManager mM = new OptionalPersonManager();

		OptionalPerson p1 = new OptionalPerson("Bob", 21, "Baker");
		OptionalPerson p2 = new OptionalPerson("Bert", 29, "Farmer");
		OptionalPerson p3 = new OptionalPerson("Jill", 57, "Builder");
		OptionalPerson p4 = new OptionalPerson("Jeff", 90, "Trainer");

		mM.addToMap(1, p1);
		mM.addToMap(2, p2);
		mM.addToMap(3, p3);
		mM.addToMap(4, p4);

		System.out.println(mM.getNameMap());

		System.out.println(mM.getFromMap(1).getResultsOfLastReview().orElseThrow());
//		mM.getFromMap(1).setResultsOfLastReview(dumm);
	}

}
