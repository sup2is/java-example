package data.structure1;

import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		
		long start;
		long end;
		
		start = System.currentTimeMillis();
		ArrayList<String> fooList = new ArrayList<String>();
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 지정하지 않았을때 인스턴스 생성 시간 : " + ( end - start )/1000.0 +"초");		
		
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			fooList.add("foo");
		}
		end = System.currentTimeMillis();
		System.out.println( "capacity를 지정하지 않았을때 실행 시간 : " + ( end - start )/1000.0 +"초");
		
		
		start = System.currentTimeMillis();
		ArrayList<String> barList = new ArrayList<String>(100000000);
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 지정했을때 인스턴스 생성 시간 : " + ( end - start )/1000.0 +"초");		
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			barList.add("bar");
		}
		end = System.currentTimeMillis();
		
		System.out.println( "capacity를 지정했을때 실행 시간 : " + ( end - start )/1000.0 +"초");
		
		
	}
	
}


