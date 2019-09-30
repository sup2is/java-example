package data.structure9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MyHashMap {

	public static void main(String[] args) throws InterruptedException {

		HashMap<String, String> hashMap = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			hashMap.put("foo" + i, "bar" + i);
		}
		
		Iterator<String> keyIterator = hashMap.keySet().iterator();
		
		System.out.println("## HashMap의 keySet()");
		
		while (keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
		}
		
		Iterator<Entry<String, String>> entryIterator = hashMap.entrySet().iterator();
		
		System.out.println("## HashMap의 entrySet()");
		
		while (entryIterator.hasNext()) {
			Entry<String,String> entry = entryIterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Iterator<String> valueIterator =  hashMap.values().iterator();
		
		System.out.println("## HashMap의 values()");
		
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
		
	
	}

}