package data.structure4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main3 {

	public static void main(String[] args) {
	
 		User user1 = new User(27 , "클라우스");
 		User user2 = new User(31 , "유하");
 		User user3 = new User(26 , "스프링초보");
 		
 		//Comparator를 제공하지 않았을때
 		//PriorityQueue<User> pq = new PriorityQueue<User>();
 		
 		//Comparator를 제공했을때
 		PriorityQueue<User> pq = new PriorityQueue<User>(new MyComparator<User>());
 		
 		pq.add(user1);
 		pq.add(user2);
 		pq.add(user3);
 	
 		System.out.println("========");
 	
 		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
 	
	}

}

class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return Integer.compare(((User)o1).getAge() , ((User)o2).getAge()); 
	}

}

class User {
		
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	

}