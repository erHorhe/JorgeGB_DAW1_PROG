//Crea un programa que pida un n�mero al usuario y diga si es positivo, negativo o cero:
Proceso Ejercicio4_3
	Definir num Como Entero
	Escribir 'Dime un n�mero:'
	Leer num
	Si num > 0 Entonces
		Escribir 'Es positivo.'
	SiNo
		Si num < 0 Entonces
			Escribir 'Es negativo.'
		SiNo
			Escribir 'Es igual a cero.'
		FinSi
	FinSi
FinProceso
