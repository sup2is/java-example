package data.structure4;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] {1,5,3,7,8,4,2,9,6};
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		for (int i = 0; i < arr.length; i++) {
			minHeap.add(arr[i]);
		}
		

		System.out.println("최소힙 실행 결과");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(minHeap.poll());
		}
		
		System.out.println("============================");
		
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			maxHeap.add(arr[i]);
		}
		
		System.out.println("최대힙 실행 결과");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(maxHeap.poll());
		}

	}

}