//Crea un programa que pida al usuario una contrase�a, de forma repetitiva mientras que no introduzca "1234".
//Cuando finalmente escriba la contrase�a correcta, se le dir� "Bienvenido" y terminar� el programa.
Proceso Ejercicio6_1
	Definir password Como Entero
	Escribir 'Escriba la contrase�a:'
	Leer password
	Mientras password<>1234 Hacer
		Escribir 'CONTRASE�A INCORRECTA. INT�NTELO DE NUEVO.'
		Leer password
	FinMientras
	Si password=1234 Entonces
		Escribir 'CONTRASE�A CORRECTA. HA INICIADO SESI�N.'
	FinSi
FinProceso
