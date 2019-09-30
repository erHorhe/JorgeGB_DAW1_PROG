Proceso Ejercicio12_2
	Definir nombre Como Caracter
	Definir i,j Como Entero
	
	Escribir Sin Saltar 'Dime tu nombre:'
	Leer nombre
	
	Para i<-0 Hasta Longitud(nombre)-1 Con Paso 1 Hacer
		Si i%2=0 Entonces
			Escribir Sin Saltar Mayusculas(Subcadena(nombre,i,i))
		SiNo
			Escribir Sin Saltar Minusculas(subcadena(nombre,i,i))
		FinSi
	FinPara
FinProceso
