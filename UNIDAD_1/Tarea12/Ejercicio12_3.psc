Proceso Ejercicio12_3
	Definir frase Como Caracter
	Definir contador, i Como Entero
	
	contador <- 0
	
	Escribir 'Escribe cualquier frase:'
	Leer frase
	
	Para i<-0 hasta Longitud(frase) Con Paso 1 hacer
		Si Subcadena(frase,i,i)=" " entonces
			contador = contador+1
		FinSi
	FinPara
	
	Escribir 'Tu frase tiene ',contador+1,' palabras.'
FinProceso
