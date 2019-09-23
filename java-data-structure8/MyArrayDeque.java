package data.structure8;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class MyArrayDeque {

	public static void main(String[] args) throws InterruptedException {

		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		Stack<Integer> stack = new Stack<>();
		
		long start;
		long end;
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 5000000; i++) {
			arrayDeque.addFirst(i);
		}
		
		while (!arrayDeque.isEmpty()) {
			arrayDeque.pollLast();
		}
		
		end = System.currentTimeMillis();
		
		System.out.println( "arrayDeque에 요소 오백만개 넣고 빼는데 걸리는 시간 : " + ( end - start )/1000.0 +"초");		
		
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 5000000; i++) {
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			stack.pop();
		}
		
		end = System.currentTimeMillis();
		
		System.out.println( "stack에 요소 오백만개 넣고 빼는데 걸리는 시간 : " + ( end - start )/1000.0 +"초");		
		
	}

}