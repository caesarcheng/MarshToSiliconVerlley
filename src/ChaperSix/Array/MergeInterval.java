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
			return 1;
		else if (this.start > o.start)
			return -1;
		else {
			if (this.end < o.end)
				return 1;
			else if (this.end > o.end)
				return -1;
			else
				return -1;
		}
	}
}

public class MergeInterval {
	void mergerInterval() {

		List<Interval> list = new ArrayList<>();
		Collections.sort(list);
		/*Iterator<Interval> iterator = list.iterator();
		Interval it = null;
		while (iterator.hasNext()) {
			it = iterator.next();
			Collections.sort
		}*/
	}

}
