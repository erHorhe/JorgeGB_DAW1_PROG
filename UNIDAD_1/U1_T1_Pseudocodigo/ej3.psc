//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
//El programa debe pedir la altura.
//Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
//
//Ejemplo:
//Por favor, introduzca la altura del reloj de arena: 7 
//*******
// *****
//	***
//	
//	 *
//	
//	***
//
// *****
//
//*******
Proceso Entregable3
	Definir altura, columna, fila, espacio Como Entero
	Escribir '¿Altura del reloj de arena?'
	Leer altura
	espacio <- 0
	Si altura%2<>0 y altura>=3 Entonces
		Para columna<-1 Hasta altura con paso 1 hacer
			Para fila<-1 Hasta altura-1 Con Paso 1 Hacer
				Escribir Sin Saltar '*'
			FinPara
			Escribir '*'
		FinPara
	SiNo
		Escribir '¡ERROR!'
	FinSi
	
FinProceso
