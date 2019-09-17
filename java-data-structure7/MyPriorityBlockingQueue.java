package data.structure7;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public class MyPriorityBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		
		PriorityBlockingQueue<FIFOEntry> enforceOrderingPbq = new PriorityBlockingQueue<>();
		
		for (int i = 0; i < 10; i++) {
			User user = new User("User" + i , 20);
			FIFOEntry<User> fifoEntry = new FIFOEntry(user);
			enforceOrderingPbq.add(fifoEntry);
		}
		
		enforceOrderingPbq.add(new FIFOEntry(new User("User99", 15)));
		
		while (!enforceOrderingPbq.isEmpty()) {
			FIFOEntry<User> fifoEntry =  enforceOrderingPbq.take();
			System.out.println(fifoEntry.seqNum + "의 시퀀스 넘버를 가진 " + fifoEntry.getEntry().name );
		}
		
		System.out.println("=======================================================");
		
		PriorityBlockingQueue<User> defaultPbq = new PriorityBlockingQueue<>();
		for (int i = 0; i < 10; i++) {
			User user = new User("User" + i , 20);
			defaultPbq.add(user);
		}
		
		defaultPbq.add(new User("User99", 15));
		
		while (!defaultPbq.isEmpty()) {
			User user = defaultPbq.take();
			System.out.println(user.name);
		}
		
		
		
	}
}

class User implements Comparable<User>{
	
	String name;
	int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(User o) {
		return Integer.compare(this.age, o.age);
	}
	
}

class FIFOEntry<E extends Comparable<? super E>> implements Comparable<FIFOEntry<E>> {
	static final AtomicLong seq = new AtomicLong(0);
	final long seqNum;
	final E entry;

	public FIFOEntry(E entry) {
		seqNum = seq.getAndIncrement();
		this.entry = entry;
	}

	public E getEntry() {
		return entry;
	}

	@Override
	public int compareTo(FIFOEntry<E> other) {
		int res = entry.compareTo(other.entry);
		if (res == 0 && other.entry != this.entry)
			res = (seqNum < other.seqNum ? -1 : 1);
		return res;
	}


}
