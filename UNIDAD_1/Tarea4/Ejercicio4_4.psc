//Haz un programa que pida al usuario y diga cu�ntos de ellos son positivos:
Proceso Ejercicio4_4
	Definir num1 como Entero
	Definir num2 Como Entero
	Definir contador Como Entero
	contador = 0
	
	Escribir 'Primero n�mero:'
	Leer num1
	Escribir 'Segundo n�mero:'
	Leer num2
	
	Si num1 > 0 Entonces
		contador = contador+1
	FinSi
	Si num2 > 0 entonces
		contador = contador+1
	FinSi
	
	Si contador=2 Entonces
		Escribir 'Los dos n�meros son positivos.'
	SiNo
		Si contador=1 Entonces
			Escribir 'Solo uno es positivo.'
		SiNo
			Escribir 'Ninguno es positivo.'
		FinSi
	FinSi
FinProceso
