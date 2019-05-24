package Optional;

import java.util.HashMap;

public class OptionalPersonManager {

	private HashMap<Integer, OptionalPerson> nameMap = new HashMap<Integer, OptionalPerson>();

	public HashMap<Integer, OptionalPerson> addToMap(Integer key, OptionalPerson value) {

		// method to add information to a Map is put()
		nameMap.put(key, value);

		return nameMap;

	}

	public HashMap<Integer, OptionalPerson> removeFromMap(Integer key) {

		// method to remove information from a Map is remove()
		nameMap.remove(key);

		return nameMap;

	}

	public OptionalPerson getFromMap(Integer key) {

		// method to get information from a Map is get()
		return nameMap.get(key);

	}

	public HashMap<Integer, OptionalPerson> getNameMap() {
		return nameMap;
	}

}
