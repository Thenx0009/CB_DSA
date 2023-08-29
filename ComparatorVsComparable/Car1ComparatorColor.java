package ComparatorVsComparable;

import java.util.Comparator;

public class Car1ComparatorColor implements Comparator<Cars1> {

	@Override
	public int compare(Cars1 o1, Cars1 o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}
}
