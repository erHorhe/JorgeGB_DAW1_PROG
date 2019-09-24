//Prepara un programa que divida dos números que introduzca el usuario.
//Si el segundo número es cero, se le deberá avisar y volver a pedir tantas veces como sea necesario, hasta que introduzca un número distinto de cero, momento en que se calculará y mostrará el resultado de la división.
Proceso Ejercicio7_3
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir 'Primer número:'
	Leer num1
	Escribir 'Segundo número:'
	Leer num2
	
	Si num2=0 entonces
		Escribir 'El segundo número es un cero.'
		Repetir
			Escribir 'Escribe otra vez el segundo número:'
			Leer num2
		Hasta Que num2<>0 
	FinSi
	
	Escribir 'Suma = ',num1+num2
FinProceso
