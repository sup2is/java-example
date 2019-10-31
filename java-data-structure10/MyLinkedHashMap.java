package data.structure10;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyLinkedHashMap {

	public static void main(String[] args) throws InterruptedException {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

		for (int i = 0; i < 10; i++) {
			lhm.put("foo" + i, "bar" + i);
		}

		lhm.put("foo5", "re-insert bar5");
		lhm.put("foo11", "bar11");

		for (Entry<String, String> string : lhm.entrySet()) {
			System.out.println(string);
		}

	}

}
