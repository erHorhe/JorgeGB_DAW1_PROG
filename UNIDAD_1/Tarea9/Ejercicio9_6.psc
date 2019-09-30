Proceso Ejercicio9_6
	Definir bloque, i, j, num_mayor1, num_mayor2 Como Real
	
	Dimension bloque[10,2]
	//Vamos recorriendo ambos bloques con dos variables, e insertamos un número a nuestra elección.
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Para j<-0 Hasta 1 Con Paso 1 Hacer
			Escribir 'Fila ',i+1," y columna ",j+1
			Leer bloque[i,j]
		FinPara
	FinPara
	
	num_mayor1 = bloque[0,0]	//Asignamos el primer número del primer bloque como el mayor de este.
	num_mayor2 = bloque[0,1]	//Asignamos el primer número del segundo bloque como el mayor de este.
	
	//Recorremos toda la primera columna (primer bloque), y vamos comparando ese número con el actual número mayor del bloque 1.
	Para i<-1 Hasta 9
		Si bloque[i,0] > num_mayor1 entonces
			num_mayor1 = bloque[i,0]
		FinSi
	FinPara
	//Recorremos toda la segunda columna (segundo bloque), y vamos comparando ese número con el actual número mayor del bloque 2.
	Para j<-1 Hasta 9
		Si bloque[j,1] > num_mayor2 entonces
			num_mayor2 = bloque[j,1]
		FinSi
	FinPara
	
	Escribir "Mayor del primer bloque -> ",num_mayor1
	Escribir "Mayor del segundo bloque -> ",num_mayor2
FinProceso
