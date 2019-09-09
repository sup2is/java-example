package github.io.exam.data.structure2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		long start , end;

		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			arrayList.add("foo" + i);
		}
		end = System.currentTimeMillis();
		System.out.println("arrayList에 요소 천만개 넣을때 걸리는 시간 : " + (end - start)/1000.0 + "초");

		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			linkedList.add("testString" + i);
		}
		end = System.currentTimeMillis();
		System.out.println("linkedList에 요소 천만개 넣을때 걸리는 시간 : " + (end - start)/1000.0 + "초");
		

		start = System.currentTimeMillis();
		arrayList.get(5000000);
		end = System.currentTimeMillis();
		System.out.println("arrayList에 오백만번째 요소 가져올때 걸리는 시간 : " + (end - start)/1000.0 + "초");
		
		
		start = System.currentTimeMillis();
		linkedList.get(5000000);
		end = System.currentTimeMillis();
		System.out.println("linkedList에 오백만번째 요소 가져올때 걸리는 시간 : " + (end - start)/1000.0 + "초");
		
		
	}
}
