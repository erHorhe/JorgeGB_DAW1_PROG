package Cliente;

import java.util.Comparator;

public class CompararNombre implements Comparator<Object> {

	@Override
	public int compare(Object nombre1, Object nombre2) {
		return ((Cliente) nombre1).compareTo(((Cliente) nombre2));
	}

}
