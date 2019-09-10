package data.structure5;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main2 {

	public static void main(String[] args) {
		
		long start, end;

		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();
		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < 5000000; i++) {
			clq.add(i);
			list.add(i);
		}
		
		start = System.currentTimeMillis();
		clq.size();
		end = System.currentTimeMillis();
		System.out.println( "ConcurrentLinkedQueue의 오백만개 size() 수행시간 : " + ( end - start )/1000.0 +"초");
		
		start = System.currentTimeMillis();
		list.size();
		end = System.currentTimeMillis();
		System.out.println( "LinkedList의 오백만개 size() 수행시간 : " + ( end - start )/1000.0 +"초");		
		
	}
}
