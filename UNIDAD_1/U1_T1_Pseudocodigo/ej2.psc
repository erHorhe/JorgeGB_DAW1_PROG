//Escribe un programa que cambie un d�gito dentro de un n�mero dando la posici�n y el valor nuevo.
//Las posiciones se cuentan de izquierda a derecha empezando por el 1.
//
//Ejemplo:
//	
//Por favor, introduzca un n�mero entero positivo: 123456
//Introduzca la posici�n dentro del n�mero: 5
//Introduzca el nuevo d�gito: 7
//El n�mero resultante es 123476
//	
//NOTA: Una pista, utilizar las funciones para texto que nos proporciona pseint
Proceso Entregable2
	Definir num, i, posicion, nuevoDigito Como Entero
	
	Escribir Sin Saltar 'D�game un n�mero positivo:'
	Leer num

	Para i<-1 Hasta longitud(convertirATexto(num)) hacer
		
	FinPara
	
	Escribir Sin Saltar '�Qu� posici�n quiere modificar?'
	Leer posicion
	
	Escribir Sin Saltar '�Qu� nuevo d�gito desea introducir?'
	Leer nuevoDigito
	
	
FinProceso
