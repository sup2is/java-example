package data.structure7;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class MyDelayQueue {

	public static void main(String[] args) throws InterruptedException {
		
		DelayQueue<Delayed> dq = new DelayQueue<>();
		
		MyDelayed md1 = new MyDelayed("MyDelayed-1", 5000000000L); // 5초동안 큐에 대기
		MyDelayed md2 = new MyDelayed("MyDelayed-2", 2000000000L); // 2초동안 큐에 대기
		MyDelayed md3 = new MyDelayed("MyDelayed-3", 10000000000L); // 10초동안 큐에 대기
		MyDelayed md4 = new MyDelayed("MyDelayed-4", 8000000000L); // 8초동안 큐에 대기
		MyDelayed md5 = new MyDelayed("MyDelayed-5", 6000000000L); // 6초동안 큐에 대기
		
		dq.add(md1);
		dq.add(md2);
		dq.add(md3);
		dq.add(md4);
		dq.add(md5);
		
		while (!dq.isEmpty()) {
			MyDelayed md = (MyDelayed) dq.take();
			System.out.println("### : " + md.name + "반환!!");
		}
	}
}

class MyDelayed implements Delayed {
	
	String name;
	final long DELAY_TIME = 1000000000L; //모든 Delayed는 1초씩 증가
	final long EXPIRE_TIME; 
	long accumulateTime = 0; //누적시간
	
	public MyDelayed(String name ,long expire_time) {
		this.name = name;
		this.EXPIRE_TIME = expire_time;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		this.accumulateTime += DELAY_TIME;
		System.out.println(name + "가 반환되기까지 남은 시간" + (EXPIRE_TIME - accumulateTime)/1000000000L + "초");
		return unit.toNanos(EXPIRE_TIME - accumulateTime > 0 ? DELAY_TIME : 0);
	}
	
	@Override
	public int compareTo(Delayed o) {
		return Long.compare(this.EXPIRE_TIME , ((MyDelayed)o).EXPIRE_TIME);
	}

}