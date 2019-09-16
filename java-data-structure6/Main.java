package data.structure6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main{

	public static void main(String[] args) {
		
		BlockingQueue<String> abq = new ArrayBlockingQueue<>(100);
		Producer p = new Producer(abq);
		Consumer c1 = new Consumer(abq, "고객1");
		Consumer c2 = new Consumer(abq, "고객2");
		Consumer c3 = new Consumer(abq, "고객3");
		Consumer c4 = new Consumer(abq, "고객4");
		Consumer c5 = new Consumer(abq, "고객5");
		Consumer c6 = new Consumer(abq, "고객6");
		
		new Thread(p).start();
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(c3).start();
		new Thread(c4).start();
		new Thread(c5).start();
		new Thread(c6).start();
		
	}
	
}


