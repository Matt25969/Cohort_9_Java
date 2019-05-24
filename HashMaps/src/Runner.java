
public class Runner {

	public static void main(String[] args) {

		MapManager mM = new MapManager();

		Person p1 = new Person("Bob", 21, "Baker");
		Person p2 = new Person("Bert", 29, "Farmer");
		Person p3 = new Person("Jill", 57, "Builder");
		Person p4 = new Person("Jeff", 90, "Trainer");

		mM.addToMap(1, p1);
		mM.addToMap(2, p2);
		mM.addToMap(3, p3);
		mM.addToMap(4, p4);

//		mM.getNameMap().containsKey(p4);
//		mM.getNameMap().isEmpty();
//		mM.getNameMap().size();

//		mM.getNameMap().keySet().stream().forEach(System.out::println);
//		mM.getNameMap().values().stream().forEach(System.out::println);

//		System.out.println(mM.getFromMap(1).getResultsOfLastReview().getScore());
//		mM.getNameMap().get(1).getResultsOfLastReview().setScore(10);
	}

}
