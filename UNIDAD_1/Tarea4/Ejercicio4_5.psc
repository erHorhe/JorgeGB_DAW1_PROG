//Crea un programa que pida al usuario dos n�meros y muestre su divisi�n si el segundo no es cero, o un mensaje de aviso en caso contrario:
Proceso Ejercicio4_5
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir 'Dime un n�mero:'
	Leer num1
	Escribir 'Dime otro:'
	Leer num2
	
	Si num2 != 0 Entonces
		Escribir num1,'/',num2,' = ',num1/num2
	SiNo
		Escribir '�NO PUEDE REALIZARSE EL C�LCULO!'
	FinSi
FinProceso
