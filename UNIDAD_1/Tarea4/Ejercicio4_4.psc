//Haz un programa que pida al usuario y diga cuántos de ellos son positivos:
Proceso Ejercicio4_4
	Definir num1 como Entero
	Definir num2 Como Entero
	Definir contador Como Entero
	contador = 0
	
	Escribir 'Primero número:'
	Leer num1
	Escribir 'Segundo número:'
	Leer num2
	
	Si num1 > 0 Entonces
		contador = contador+1
	FinSi
	Si num2 > 0 entonces
		contador = contador+1
	FinSi
	
	Si contador=2 Entonces
		Escribir 'Los dos números son positivos.'
	SiNo
		Si contador=1 Entonces
			Escribir 'Solo uno es positivo.'
		SiNo
			Escribir 'Ninguno es positivo.'
		FinSi
	FinSi
FinProceso
