//Haz un programa que permita calcular la suma de pares de números.
//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0.
//Esta vez deberás usar "Repetir", por lo que tu solución no será igual que la del ejercicio 6.2, que empleaba "Mientras".
Proceso Ejercicio7_2
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir Sin Saltar'Primer número:'
	Leer num1
	Escribir Sin Saltar'Segundo número:'
	Leer num2
	
	Mientras num1<>0 o num2<>0 Hacer
		Escribir 'Suma = ',num1+num2
		Repetir
			Escribir 'Introduce nuevamente dos números.'
			Leer num1
			Leer num2
		Hasta Que num1=0 y num2=0
	Fin Mientras
FinProceso
