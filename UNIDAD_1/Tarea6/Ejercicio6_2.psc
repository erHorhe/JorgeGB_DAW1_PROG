//Haz un programa que permita calcular la suma de pares de n�meros.
//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que ambos n�meros introducidos sean 0.
Proceso Ejercicio6_2
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir 'Primer n�mero:'
	Leer num1
	Escribir 'Segundo n�mero:'
	Leer num2
	
	Mientras num1<>0 y num2<>0 Hacer
		Escribir 'Suma = ',num1+num2
		Escribir 'Introduce nuevamente dos n�meros.'
		Leer num1
		Leer num2
	FinMientras
FinProceso
