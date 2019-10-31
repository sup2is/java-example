package data.structure11;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) throws InterruptedException {

		TreeMap<Integer, String> tm = new TreeMap<>();
		int[] arr = new int[20];
		
		for (int i = 0; i < 20; i++) {
			int t = (int)(Math.random() * 100) + 1;
			arr[i] = t;
			tm.put(t, "bar" + t);
		}
		
		Arrays.sort(arr);
		
		int middle = arr[arr.length/2 - 1];
		
		for (Entry<Integer, String> s: tm.entrySet()) {
			System.out.println(s);
		}
		
		System.out.println("middle key값 : " + middle);
		
		System.out.println("middle 값의 lowerEntry : " + tm.lowerEntry(middle).getKey() + "=" + tm.lowerEntry(middle).getValue());
		
		System.out.println("middle 값의 higherEntry : " + tm.higherEntry(middle).getKey() + "=" + tm.higherEntry(middle).getValue());
		
		System.out.println("middle 값을 기준으로 상위 entrySet ..");
		
		for (Entry<Integer, String> s : tm.headMap(middle).entrySet()) {
			System.out.println(s);
		}
		
		System.out.println("middle 값을 포함하는 하위 entrySet ..");
		
		for (Entry<Integer, String> s : tm.tailMap(middle).entrySet()) {
			System.out.println(s);
		}
		
		System.out.println("TreeMap의 최상단 노드 : " + tm.firstEntry().getKey() + "=" + tm.firstEntry().getValue());
		
		System.out.println("TreeMap의 최하단 노드 : " + tm.lastEntry().getKey() + "=" + tm.lastEntry().getValue());
		
	}
}
