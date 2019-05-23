import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> personList = new ArrayList<Person>();

	public Person searchForName(String name) {

		return personList.stream().filter(p -> p.equals(name)).findFirst().get();
	}

	public void setPersonList(ArrayList<Person> personlist) {
		this.personList = personlist;
	}

	public ArrayList<Person> getPersonList() {
		return personList;
	}

}
