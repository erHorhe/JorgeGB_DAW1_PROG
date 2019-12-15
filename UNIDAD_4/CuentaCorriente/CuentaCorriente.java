package CuentaCorriente;

public class CuentaCorriente {

	//Attributes:
		private double saldo;
		private int limiteDesc;
		public String nombre;
		protected String dni;
		private Banco b;
		
	//Constructors:
		public CuentaCorriente(String nombre, String dni, Banco b) {
			saldo = 0;
			limiteDesc = -50;
			this.nombre = nombre;
			this.dni = dni;
			this.b = b;
		}
		public CuentaCorriente(String nombre, String dni) {
			saldo = 0;
			limiteDesc = -50;
			this.nombre = nombre;
			this.dni = dni;
		}
		public CuentaCorriente(double saldo) {
			this.saldo = saldo;
			this.limiteDesc = 0;
		}
		public CuentaCorriente(double saldo, int limiteDesc, String dni) {
			this.saldo = saldo;
			this.limiteDesc = limiteDesc;
			this.dni = dni;
		}
		
	//Methods:
		public boolean sacarDinero(double peticion) { 
			boolean resultado = false;
			
			if (saldo-peticion >= limiteDesc) {
				saldo -= peticion;
				resultado = true;
			}
			
			return resultado;
		}
		
		public void ingresarDinero(double ingreso) {
			
			saldo += ingreso;
		}
		
		public void mostrarInformacion() {
			System.out.println("Nombre del titular -> " + nombre
					+ "\n"
					+ "DNI -> " + dni
					+ "\n"
					+ "Saldo actual -> " + saldo);
			if (b != null) {
				b.mostrarInformacion();
			}
			
		}
		
		public Banco cambiarNombreB(Banco nuevoNombreBanco) {
			b = nuevoNombreBanco;
			return b;
		}
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public int getLimiteDesc() {
			return limiteDesc;
		}
		public void setLimiteDesc(int limiteDesc) {
			this.limiteDesc = limiteDesc;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
}