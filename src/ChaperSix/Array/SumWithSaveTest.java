package ChaperSix.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SumWithSaveTest {
	public static Map<Integer,Integer> map = new HashMap<>( );
	public static void Save(int input){
		if(map.containsKey(input)){
			map.put(input, map.get(input)+1);
		}else{
		map.put(input, 1);
		}
	}
	public static boolean Test(int target){
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			int key = iterator.next().getKey();
				if(map.containsKey(target-key)){
					if(target-key==key && map.get(key)<=1)return false; 
					return true;
			} 
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a= { 2, 10, 3, 2, 5 };
		for(int i:a){
			Save(i);
		}
	System.out.println(	Test(15));
	}
}
