//Prepara un programa que pida al usuario tres números y diga cuál es el mayor de los tres.
Proceso Ejercicio4_6
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir num3 Como Entero
	
	Escribir Sin Saltar 'Primer número:'
	Leer num1
	Escribir Sin Saltar 'Segundo número:'
	Leer  num2
	Escribir Sin Saltar 'Tercer número:'
	Leer num3
	
	Si num1>num2 y num1>num3 Entonces
		Escribir num1,' es el mayor número.'
	SiNo
		Si num2>num1 y num2>num3 Entonces
			Escribir num2,' es el mayor número.'
		SiNo
			Escribir num3,' es el mayor número.'
		FinSi
	FinSi
FinProceso
