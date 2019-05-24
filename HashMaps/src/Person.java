public class Person {

	private String name;
	private int age;
	private String jobTitle;

	// not in constructor but thats ok for now
	private Review resultsOfLastReview;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + jobTitle;
	}

	public Review getResultsOfLastReview() {
		return resultsOfLastReview;
	}

	public void setResultsOfLastReview(Review resultsOfLastReview) {
		this.resultsOfLastReview = resultsOfLastReview;
	}

}
