package data.structure10;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyLinkedHashMap2 {

	public static void main(String[] args) throws InterruptedException {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<>(1000, 0.75f, true);

		for (int i = 0; i < 10; i++) {
			lhm.put("foo" + i, "bar" + i);
		}

		lhm.put("foo5", "re-insert bar5");
		lhm.put("foo11", "bar11");
		lhm.get("foo3");
		
		for (Entry<String, String> string : lhm.entrySet()) {
			System.out.println(string);
		}
	}
}
