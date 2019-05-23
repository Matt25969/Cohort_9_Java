
public abstract class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String printOutDetail() {
		return name + age + " " + jobTitle;

	}

	@Override
	public String toString() {
		return name + " " + age + " " + jobTitle;
	}

	public abstract String myAbstractMethod();

}
