Proceso Ejercicio12_1
	Definir nombre Como Caracter
	Definir i Como Entero
	Escribir Sin Saltar 'Dime tu nombre:'
	Leer nombre
	
	Para i<-Longitud(nombre)-1 hasta 0 con paso -1 hacer
		Escribir Sin Saltar (subcadena(nombre,i,i))
	FinPara
FinProceso
