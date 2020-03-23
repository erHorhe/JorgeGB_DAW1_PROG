package tarea4;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Empleado> mapa_empleados = new HashMap<String, Empleado>();
		Empleado e1 = new Empleado("Jorge Gómez Blanco", "53343849H", 19, 1.80,
				0);

		String respuesta = JOptionPane
				.showInputDialog("¿Desea cargar los datos de empleados o insertarlos desde la consola (cargar/insertar)?");
		switch (respuesta) {
		case "cargar":
			String respuesta2 = JOptionPane
					.showInputDialog("¿Qué desea hacer ahora?\n"
							+ "1. VISUALIZAR LISTADO\n"
							+ "2. BORRAR EMPLEADO/S\n"
							+ "3. VISUALIZAR EMPLEADO\n"
							+ "4. MODIFICAR EMPLEADO\n"
							+ "5. INSERTAR EMPLEADO/S\n");
			switch (respuesta2) {
			case "1":
				e1.visualizarListado(mapa_empleados);
				break;
			case "2":
				e1.borrarEmpleado(mapa_empleados, "53343849H");
				break;
			case "3":
				e1.visualizarEmpleado(mapa_empleados, "53343849H");
				break;
			case "4":
				e1.modificarEmpleado(mapa_empleados, "53343849H");
				break;
			case "5":
				e1.insertarEmpleado(mapa_empleados);
				break;
			}
			break;
		case "insertar":

			break;
		}
	}
}
