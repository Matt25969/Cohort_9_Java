import java.util.HashMap;

public class MapManager {

	private HashMap<Integer, Person> nameMap = new HashMap<Integer, Person>();

	public HashMap<Integer, Person> addToMap(Integer key, Person value) {

		// method to add information to a Map is put()
		nameMap.put(key, value);

		return nameMap;

	}

	public HashMap<Integer, Person> removeFromMap(Integer key) {

		// method to remove information from a Map is remove()
		nameMap.remove(key);

		return nameMap;

	}

	public Person getFromMap(Integer key) {

		// method to get information from a Map is get()
		return nameMap.get(key);

	}

	public HashMap<Integer, Person> getNameMap() {
		return nameMap;
	}

}
