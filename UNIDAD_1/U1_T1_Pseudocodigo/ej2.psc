//Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo.
//Las posiciones se cuentan de izquierda a derecha empezando por el 1.
//
//Ejemplo:
//	
//Por favor, introduzca un número entero positivo: 123456
//Introduzca la posición dentro del número: 5
//Introduzca el nuevo dígito: 7
//El número resultante es 123476
//	
//NOTA: Una pista, utilizar las funciones para texto que nos proporciona pseint
Proceso Entregable2
	Definir num, i, posicion, nuevoDigito Como Entero
	
	Escribir Sin Saltar 'Dígame un número positivo:'
	Leer num

	Para i<-1 Hasta longitud(convertirATexto(num)) hacer
		
	FinPara
	
	Escribir Sin Saltar '¿Qué posición quiere modificar?'
	Leer posicion
	
	Escribir Sin Saltar '¿Qué nuevo dígito desea introducir?'
	Leer nuevoDigito
	
	
FinProceso
