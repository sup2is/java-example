package data.structure11;

import java.util.Arrays;
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MyTreeMap2 {

	public static void main(String[] args) throws InterruptedException {

		TreeMap<Integer, String> tm = new TreeMap<>();
		int[] arr = new int[20];
		
		for (int i = 0; i < 20; i++) {
			int t = (int)(Math.random() * 100) + 1;
			arr[i] = t;
			tm.put(t, "김아무개의 나이는 :" + t);
		}
		
		Arrays.sort(arr);
		
		int middle = arr[arr.length/2 - 1];
		
		for (Entry<Integer, String> s: tm.entrySet()) {
			System.out.println(s);
		}
		
		System.out.println("middle key값 : " + middle);
		
		SortedMap<Integer, String> NavigableRangeMap = tm.subMap(25 , true, 50, true);
		
		System.out.println("# 25살 ~ 50살의 김아무개 범위 subMap entry ..");
		
		for (Entry<Integer, String> t : NavigableRangeMap.entrySet()) {
			System.out.println(t);
		}
		
	}
}
