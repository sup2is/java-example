package data.structure5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

	public static void main(String[] args) {

		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();

		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
			clq.add(i);
		}
		
		Iterator<Integer> listIterator = list.iterator();
		Iterator<Integer> queueIterator = clq.iterator();
		
		while (queueIterator.hasNext()) {
			System.out.println(queueIterator.next());
			clq.poll();
			clq.add((int) (Math.random() * 10));
		}
		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			//ConcurrentModificationException 발생
			list.add((int) Math.random() * 10);
		}
		
	}
}
