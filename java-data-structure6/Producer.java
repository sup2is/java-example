package data.structure6;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	private final BlockingQueue<String> queue;

	final String[] GOODS = new String[] {"아이폰", "갤럭시", "에어팟", "무풍에어컨", "스타일러"};
	
	
	public Producer (BlockingQueue<String> bq) {
		this.queue = bq;
	}

	@Override
	public void run() {
		while(true) {
			try {
				long time = ((long) (Math.random()* 10000)) / 2;
				System.out.println("생산자는 앞으로 약 " + time+ "(millisecond)초 동안 block됩니다. 고객들은 기다려주세요");
				Thread.sleep(time);
				queue.put(produce());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private String produce() {
		return GOODS[((int)(Math.random()* 10) % 5)];
	}
	
}
