Proceso Ejercicio9_5
	Definir matriz, i, numMayor Como Entero
	
	Dimension matriz[7]
	
	Escribir 'Escribe siete números enteros:'
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		Leer matriz[i]
	FinPara
	
	numMayor = matriz(0)
	
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		Si matriz(i)>numMayor Entonces
			numMayor = matriz(i)
		FinSi
	FinPara
	
	Escribir 'El mayor número es ',numMayor
FinProceso
