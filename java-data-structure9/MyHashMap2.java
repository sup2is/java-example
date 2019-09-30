package data.structure9;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap2 {

	public static void main(String[] args) throws InterruptedException {

		long start;
		long end;
		
		//capacity 없이 생성
		HashMap<String, String> hashMap = new HashMap<>();
		
		start = System.currentTimeMillis();
		addMilionElement(hashMap);
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 지정하지 않았을때 String:String 요소 500만개 put() 소요 시간 : " + ( end - start )/1000.0 +"초");		
		
		
		//capacity 250만으로 생성
		hashMap = new HashMap<>(2500000);
		
		start = System.currentTimeMillis();
		addMilionElement(hashMap);
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 250만으로 지정하고 String:String 요소 500만개 put() 소요 시간 : " + ( end - start )/1000.0 +"초");		
		
		
		//capacity 250만, load factor 0.4f 로 생성
		hashMap = new HashMap<>(2500000 , 0.4f);
		
		start = System.currentTimeMillis();
		addMilionElement(hashMap);
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 250만, load factor를 0.4f으로 지정하고 String:String 요소 500만개 put() 소요 시간 : " + ( end - start )/1000.0 +"초");		
		
		//capacity 250만, load factor 0.95f 로 생성
		hashMap = new HashMap<>(2500000 , 0.95f);
		
		start = System.currentTimeMillis();
		addMilionElement(hashMap);
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 250만, load factor를 0.95f으로 지정하고 String:String 요소 500만개 put() 소요 시간 : " + ( end - start )/1000.0 +"초");		
		
	}
	
	static void addMilionElement(Map<String, String> map) {
		for (int i = 0; i < 5000000; i++) {
			map.put("foo" + i, "bar + i");
		}
	}

}