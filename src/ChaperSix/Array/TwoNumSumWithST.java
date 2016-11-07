package ChaperSix.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TwoNumSumWithST {
	public static Map<Integer, Integer> map = new HashMap<>();

	void Save(int i) {
		int value = 0;
		if (map.containsKey(i)) {
			value = map.get(i);
		}
		map.put(i, ++value);

	}

	boolean Test(int sum) {
		if (null == map)
			return false;
		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		Entry<Integer, Integer> e = null;
		while (iterator.hasNext()) {
			e = iterator.next();
			int key = e.getKey();
			int value = e.getValue();
			if ((key == (sum >> 1) && value > 1) || (map.containsKey(sum - key) && key != sum >> 1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 7, 8, 4, 2, 5, 1, 9,9 };
		TwoNumSumWithST t = new TwoNumSumWithST();
		for (int j : a) {
			t.Save(j);
		}
		System.out.println(t.Test(18));
	}
}
