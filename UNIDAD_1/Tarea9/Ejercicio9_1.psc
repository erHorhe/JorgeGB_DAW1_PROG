Proceso Ejercicio9_1
	Definir num, meses Como Entero
	Escribir Sin Saltar 'Dime un número:'
	Leer num
	Dimension meses(12)
	meses[0] = 31 //Enero
	meses[1] = 28 //Febrero
	meses[2] = 31 //Marzo
	meses[3] = 30 //Abril
	meses[4] = 31 //Mayo
	meses[5] = 30 //Junio
	meses[6] = 31 //Julio
	meses[7] = 31 //Agosto
	meses[8] = 30 //Septiembre
	meses[9] = 31 //Octubre
	meses[10] = 30 //Noviembre
	meses[11] = 31 //Diciembre
	Si num>=13 entonces
		Escribir 'Ese mes no existe.'
	SiNo
		Escribir meses[num-1], ' días.'
	FinSi
	
FinProceso
