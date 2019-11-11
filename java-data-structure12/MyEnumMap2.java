package data.structure12;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map.Entry;

import org.springframework.http.HttpStatus;

public class MyEnumMap2 {

	public static void main(String[] args) throws Exception {
		
		long start;
		long end;
		
		EnumMap<HttpStatus, String> httpStatusMap = new EnumMap<>(HttpStatus.class);
		
		start = System.nanoTime();
		
		for (HttpStatus h : HttpStatus.values()) {
			httpStatusMap.put(h, h.getReasonPhrase());
		}
		
		end = System.nanoTime();
		
		System.out.println( "EnumMap에 HttpStatus key:value값 insert 시간 : " + ( end - start )/10000000.0 +"초");
		
		HashMap<String, String> hm = new HashMap<>();

		start = System.nanoTime();
		
		for (HttpStatus e : HttpStatus.values()) {
			hm.put(e.toString(), e.getReasonPhrase());
		}
		
		end = System.nanoTime();
		
		System.out.println( "HashMap에 HttpStatus key:value값 insert 시간 : " + ( end - start )/10000000.0 +"초");
		
	}
}
