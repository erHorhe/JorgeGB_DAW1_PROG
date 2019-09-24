//Crea un programa que pida al usuario un código de usuario y una contraseña.
//Deberá repetirse hasta que el código sea "1" y la contraseña sea "1234"
Proceso Ejercicio7_1
	Definir usuario Como Entero
	Definir password Como Entero
	Escribir Sin Saltar 'Usuario:'
	Leer usuario
	Escribir Sin Saltar 'Contraseña:'
	Leer password
	
	Repetir
		Escribir 'Acceso denegado. Usuario y/o contraseña incorrectos.'
		Escribir Sin Saltar 'Usuario:'
		Leer usuario
		Escribir Sin Saltar 'Contraseña:'
		Leer password
	Hasta Que usuario=1 y password=1234
FinProceso
