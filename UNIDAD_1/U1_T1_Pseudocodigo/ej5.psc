//Realizar un algoritmo que contenga dos funciones para trabajar con vectores (arrays).
//		
//- contiene. Recibirá dos parámetros, un array de enteros y un entero a buscar.
//	Devolverá verdaderos si el entero está en el vector y falso en caso contrario.
//			
//- ocurrencias. Recibirá dos parámetros, un array de enteros y un entero a buscar.
//	Devolverá el número de ocurrencias de ese entero en el vector.
//			
//El cuerpo del algoritmo llamará al menos dos veces a cada una de las funciones.
Proceso Entregable5
	Definir num, array, i Como Entero
	Escribir Sin Saltar 'Dime un número:'
	Leer num
	Escribir '¿Aparece en el arreglo creado? ', contiene(num)
	Escribir '¿Cuántas veces aparece tu número en él? ', ocurrencias(num)
FinProceso

Funcion enVector = contiene(num_contiene)
	Definir array_contiene, i como Entero
	Definir enVector Como Logico
	Dimension array_contiene[10]
	Para i<-0 Hasta 9 con paso 1 hacer
		Leer array_contiene[i]
	FinPara
	Para i<-0 hasta 9 con paso 1 hacer
		Si num_contiene = array_contiene[i] entonces
			enVector = Verdadero
		SiNo
			enVector = Falso
		FinSi
	FinPara
FinFuncion

Funcion contador = ocurrencias(num_ocurrencias)
	Definir i, contador como Entero
	
FinFuncion
