package data.structure3;

import java.util.List;

public class FooRunner extends Thread{

	List<String> myList;
	
	public FooRunner(List<String> list) {
		this.myList = list;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep((long) (Math.random()*10));
			} catch (InterruptedException ignore) {}
			
			myList.add("foo");
		}
	}

}
