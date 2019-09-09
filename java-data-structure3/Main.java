package data.structure3;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		long start;
		long end;
		
		ArrayList<String> fooList = new ArrayList<String>();
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			fooList.add("foo");
		}
		end = System.currentTimeMillis();
		System.out.println( "ArrayList의 String 요소 천만개 추가시간 : " + ( end - start )/1000.0 +"초");
		
		
		Vector<String> barVector = new Vector<String>();
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			barVector.add("bar");
		}
		end = System.currentTimeMillis();
		
		System.out.println( "Vector의 String 요소 천만개 추가시간 : " + ( end - start )/1000.0 +"초");
		
		start = System.currentTimeMillis();
		fooList.get(5000000);
		end = System.currentTimeMillis();
		System.out.println( "ArrayList의 오백만번째 데이터 가져오는 시간 : " + ( end - start )/1000.0 +"초");
		
		start = System.currentTimeMillis();
		fooList.get(5000000);
		end = System.currentTimeMillis();
		System.out.println( "Vector의 오백만번째 데이터 가져오는 시간 : " + ( end - start )/1000.0 +"초");

	}
	
	
}
