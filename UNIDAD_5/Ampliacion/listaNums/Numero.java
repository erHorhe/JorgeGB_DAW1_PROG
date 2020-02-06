package listaNums;

import java.util.Comparator;

public class Numero implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg1.compareTo(arg0);
	}
}
