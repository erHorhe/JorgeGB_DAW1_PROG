Proceso Ejercicio11_2
	Definir num Como Entero
	
	Escribir Sin Saltar 'Dime un número para que calcule su raíz cuadrada:'
	Leer num
	
	Repetir
		Si num<0 Entonces
			Escribir 'Los números negativos no tienen raíz cuadrada.'
		SiNo
			Escribir RC(num)
			Escribir Sin Saltar 'Dime otro número:'
			Leer num
		FinSi
	Hasta Que num=0
FinProceso
