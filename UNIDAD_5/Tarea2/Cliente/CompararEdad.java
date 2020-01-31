package Cliente;

import java.util.Comparator;

public class CompararEdad implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Cliente)o1).edad - ((Cliente)o2).edad;
	}

}
