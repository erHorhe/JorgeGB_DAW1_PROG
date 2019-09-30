Proceso Ejercicio9_3
	Definir nums, i, sumaNums Como Real
	
	sumaNums = 0
	
	Dimension nums[5]
	Para i=0 Hasta 4 Hacer
		Leer nums[i]
	FinPara
	
	Para i=0 Hasta 4 Hacer
		sumaNums = nums[i]+sumaNums
	FinPara
	
	Escribir 'Media = ', sumaNums/5
	
	Para i=0 Hasta 4 Hacer
		Si nums[i]>sumaNums/5 Entonces
			Escribir nums[i],' es mayor que la media.'
		FinSi
	FinPara
FinProceso
