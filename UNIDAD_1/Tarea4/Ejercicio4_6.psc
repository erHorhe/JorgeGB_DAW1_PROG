//Prepara un programa que pida al usuario tres n�meros y diga cu�l es el mayor de los tres.
Proceso Ejercicio4_6
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir num3 Como Entero
	
	Escribir Sin Saltar 'Primer n�mero:'
	Leer num1
	Escribir Sin Saltar 'Segundo n�mero:'
	Leer  num2
	Escribir Sin Saltar 'Tercer n�mero:'
	Leer num3
	
	Si num1>num2 y num1>num3 Entonces
		Escribir num1,' es el mayor n�mero.'
	SiNo
		Si num2>num1 y num2>num3 Entonces
			Escribir num2,' es el mayor n�mero.'
		SiNo
			Escribir num3,' es el mayor n�mero.'
		FinSi
	FinSi
FinProceso
