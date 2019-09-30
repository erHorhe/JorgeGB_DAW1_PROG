Proceso Ejercicio9_4
	Definir vectorX, vectorY, i Como Entero
	
	Dimension vectorX(3)
	Dimension vectorY(3)
	
	Escribir 'Vector X:'
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Leer vectorX[i]
	FinPara
	Escribir 'Vector Y:'
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Leer vectorY[i]
	FinPara
	
	Para i<-0 Hasta 2 Hacer
		Escribir 'La suma de la ',i+1,'ª posición es ',vectorX[i]+vectorY[i]
	FinPara
FinProceso
