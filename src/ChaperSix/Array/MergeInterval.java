package ChaperSix.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Interval implements Comparable<Interval> {
	int start;
	int end;

	public Interval(int s, int e) {
		this.end = e;
		this.start = s;
	}
	

	@Override
	public int compareTo(Interval o) {
		if (this.start < o.start)
			return -1;
		else if (this.start > o.start)
			return 1;
		else {
			if (this.end < o.end)
				return -1;
			else return 1;
			
		}
	}
}

public class MergeInterval {

	public static List<Interval> list = new ArrayList<>();
	public static List<Interval> sets = new ArrayList<>();
	static void mergerInterval() {

		Collections.sort(list);
		
		sets.add(list.get(0));
		Interval inter = null;
		for (Interval interval : list) {
			inter = sets.get(sets.size()-1);
			if(inter.end>= interval.start){
				inter.end=Math.max(inter.end, interval.end);
			}else {
				sets.add(interval);
			}
		}
		for (Interval interval : sets) {
			System.out.print("[ "+interval.start+", "+interval.end+" ] \t");
		}
	}

	
	
	public static void main(String[] args) {
		// [1,5] [6,10] ,[4,6], [15 , 20 ]
		int[] a = { 1, 5, 6, 10, 4, 6, 15, 20 };
		Interval interval = null;
		for (int i = 0, len = a.length; i < len; i += 2) {
			interval = new Interval(a[i], a[i + 1]);
			list.add(interval);
		}
		mergerInterval();
		
	}

}
