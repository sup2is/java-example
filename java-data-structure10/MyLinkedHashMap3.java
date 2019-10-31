package data.structure10;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyLinkedHashMap3 {

	public static void main(String[] args) throws InterruptedException {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>(1000,0.75f,true) {
			
			private final int MAX = 10;
			
			protected boolean removeEldestEntry(java.util.Map.Entry<String,String> eldest) {
				return size() >= MAX;
			};
			
		};
		
		for (int i = 0; i < 10; i++) {
			lhm.put("foo" + i, "bar" + i);
		}

		lhm.put("foo5", "re-insert bar5");
		lhm.put("foo4", "re-insert bar4");
		lhm.put("foo12", "bar12");
		lhm.put("foo13", "bar13");
		lhm.put("foo14", "bar14");
		lhm.put("foo15", "bar15");
		lhm.put("foo5", "re-insert bar5");

		for (Entry<String, String> string : lhm.entrySet()) {
			System.out.println(string);
		}
		
	}
	
}
