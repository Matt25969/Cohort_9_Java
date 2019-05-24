package Optional;

import java.util.Optional;

public class OptionalPerson {

	private String name;
	private int age;
	private String jobTitle;
	private Optional<Review> resultsOfLastReview;

	public OptionalPerson(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	@Override
	public String toString() {
		return name + " " + age + " " + jobTitle;
	}

	public Optional<Review> getResultsOfLastReview() {

		return resultsOfLastReview;
	}

	public void setResultsOfLastReview(Optional<Review> resultsOfLastReview) {
		this.resultsOfLastReview = resultsOfLastReview;
	}

}
