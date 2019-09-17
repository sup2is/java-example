package data.structure7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyLinkedBlockingQueue {

	
	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();
		long start;
		long end;
	
		start = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			lbq.add(i);
		}
		end = System.currentTimeMillis();
		
		System.out.println( "LinkedBlockingQueue의 요소 오백만개 넣는 시간 : " + ( end - start )/1000.0 +"초");		

		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(5000000);
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			abq.add(i);
		}
		end = System.currentTimeMillis();
		
		System.out.println( "ArrayBlockingQueue의 요소 오백만개 넣는 시간 : " + ( end - start )/1000.0 +"초");
		
	}
	

}
