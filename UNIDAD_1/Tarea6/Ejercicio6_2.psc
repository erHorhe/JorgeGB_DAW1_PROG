//Haz un programa que permita calcular la suma de pares de números.
//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0.
Proceso Ejercicio6_2
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir 'Primer número:'
	Leer num1
	Escribir 'Segundo número:'
	Leer num2
	
	Mientras num1<>0 y num2<>0 Hacer
		Escribir 'Suma = ',num1+num2
		Escribir 'Introduce nuevamente dos números.'
		Leer num1
		Leer num2
	FinMientras
FinProceso
