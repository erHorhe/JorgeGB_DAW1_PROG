Proceso Ejercicio9_2
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
FinProceso
