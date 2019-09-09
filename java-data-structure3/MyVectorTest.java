package data.structure3;

import java.util.Vector;

public class MyVectorTest {

	public static void main(String[] args) {
		
		MyVector<String> myVector = new MyVector<>();

		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		new FooRunner(myVector).start();
		
	}
}

class MyVector<E> extends Vector<E> {
	
	@Override
	public synchronized boolean add(E e) {
		
		try {
			Thread.sleep((long) (Math.random()*10));
		} catch (InterruptedException ignore) {}
		
		System.out.println(this.size());
		return super.add(e);
	}
}
