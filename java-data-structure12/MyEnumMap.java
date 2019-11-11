package data.structure12;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map.Entry;
import org.springframework.http.HttpStatus;

public class MyEnumMap {

	public static void main(String[] args) throws Exception {
		
		
		EnumMap<Fruit, String> fruitMap = new EnumMap<>(Fruit.class);
		
		for (Fruit f : Fruit.values()) {
			fruitMap.put(f, f.toString() + " is delicious");
		}
		
		HashMap<String, String> hm = new HashMap<>();

		for (Entry<Fruit, String> e : fruitMap.entrySet()) {
			hm.put(e.getKey().toString(), e.getValue());
		}
		
		for (Entry<Fruit, String> e : fruitMap.entrySet()) {
			
			if(e.getKey().equals(Fruit.MANGO)) {
				//iterator 내부에서 hashMap의 데이터 셋 변경 -> 에러안남
				fruitMap.remove(Fruit.MANGO);
			}
		}
		
		System.out.println(fruitMap.toString());
		
		for (Entry<String, String> e : hm.entrySet()) {
			
			if(e.getKey().equals(Fruit.HUCKLEBERRY.toString())) {
				//iterator 내부에서 hashMap의 데이터 셋 변경 -> 에러발생
				hm.remove(Fruit.HUCKLEBERRY.toString());
			}
		}
		
		System.out.println(hm.toString());
		
	}
	
	enum Fruit {
		APPLE, BLUEBERRY, COCONUT, DURIAN, GRAPE, HUCKLEBERRY, JACKFRUIT, MANGO, ORANGE, PINEAPPLE
	}
	
}
