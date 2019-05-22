import java.util.ArrayList;

public class MyArray {

	static ArrayList<String> a1 = new ArrayList<String>();
//	ArrayList<String> a1 = new ArrayList<String>();

	public void fillArray() {
		a1.add("1");
		a1.add("2");
		a1.add("3");
	}

	public void removeFromArray() {
		a1.remove(0);
	}

}
