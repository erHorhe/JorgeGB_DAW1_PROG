Proceso Ejercicio11_2
	Definir num Como Entero
	
	Escribir Sin Saltar 'Dime un n�mero para que calcule su ra�z cuadrada:'
	Leer num
	
	Repetir
		Si num<0 Entonces
			Escribir 'Los n�meros negativos no tienen ra�z cuadrada.'
		SiNo
			Escribir RC(num)
			Escribir Sin Saltar 'Dime otro n�mero:'
			Leer num
		FinSi
	Hasta Que num=0
FinProceso
