Proceso Ejercicio13_1
	Definir text Como Caracter
	Escribir Sin Saltar 'Escribir texto a centrar:'
	Leer text
	EscribirCentrado(text)
FinProceso

SubProceso EscribirCentrado(text)
	Definir i Como Entero
	Para i<-0 Hasta (40-longitud(text)/2) con paso 1 hacer
		Escribir Sin Saltar ""
	FinPara
	Escribir text
FinSubProceso
