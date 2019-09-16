package data.structure6;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	private final BlockingQueue<String> queue;
	private final String name;
	
	public Consumer (BlockingQueue<String> bq, String name) {
		this.queue = bq;
		this.name = name;
	}

	@Override
	public void run() {

		while(true) {
			try {
				consume(queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void consume(String string) {
		System.out.println(name + "의 이름을 가진 thread가 " + string + "을 구매했습니다.");
	}
	
}
