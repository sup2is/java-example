package data.structure4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main2 {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < 50; i++) {
			pq.add((int) (Math.random() * 100));
		}
		
		System.out.println("PriorityQueue의 Iterator 사용");

		Iterator<Integer> iterator = pq.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("------------------------------");
		System.out.println("PriorityQueue의 poll() 사용");
		
		for (int i = 0; i < 50; i++) {
			System.out.println(pq.poll());
		}

	}

}