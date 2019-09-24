//Crea un programa que pida al usuario una contraseña, de forma repetitiva mientras que no introduzca "1234".
//Cuando finalmente escriba la contraseña correcta, se le dirá "Bienvenido" y terminará el programa.
Proceso Ejercicio6_1
	Definir password Como Entero
	Escribir 'Escriba la contraseña:'
	Leer password
	Mientras password<>1234 Hacer
		Escribir 'CONTRASEÑA INCORRECTA. INTÉNTELO DE NUEVO.'
		Leer password
	FinMientras
	Si password=1234 Entonces
		Escribir 'CONTRASEÑA CORRECTA. HA INICIADO SESIÓN.'
	FinSi
FinProceso
