package data.structure3;

import java.util.ArrayList;
import java.util.Vector;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		
		MyArrayList<String> myArrayList = new MyArrayList<>();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		new FooRunner(myArrayList).start();
		
	}
}

class MyArrayList<E> extends ArrayList<E> {
	
	@Override
	public boolean add(E e) {
		
		try {
			Thread.sleep((long) (Math.random()*10));
		} catch (InterruptedException ignore) {}
		
		System.out.println(this.size());
		return super.add(e);
	}
}

