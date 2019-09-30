Proceso Ejercicio11_1
	Definir numUsuario, numAzar, contador Como Entero
	numAzar <- AZAR(101)
	contador <- 0
	Escribir Sin Saltar 'Adivina el número generado aleatoriamente:'
	Leer numUsuario
	
	Mientras numUsuario!=numAzar y contador<7 Hacer
		Si numUsuario<numAzar entonces
			Escribir 'Se ha quedado corto.'
		SiNo
			Escribir 'Se ha pasado.'
		FinSi
			contador = contador+1
		Escribir Sin Saltar 'Inténtalo de nuevo:'
		Leer numUsuario
	FinMientras
	Escribir '¡CORRECTO! ¡ESE ERA EL NÚMERO!'
FinProceso
