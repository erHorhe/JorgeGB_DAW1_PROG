//Haz un programa que permita calcular la suma de pares de n�meros.
//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que ambos n�meros introducidos sean 0.
//Esta vez deber�s usar "Repetir", por lo que tu soluci�n no ser� igual que la del ejercicio 6.2, que empleaba "Mientras".
Proceso Ejercicio7_2
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir Sin Saltar'Primer n�mero:'
	Leer num1
	Escribir Sin Saltar'Segundo n�mero:'
	Leer num2
	
	Mientras num1<>0 o num2<>0 Hacer
		Escribir 'Suma = ',num1+num2
		Repetir
			Escribir 'Introduce nuevamente dos n�meros.'
			Leer num1
			Leer num2
		Hasta Que num1=0 y num2=0
	Fin Mientras
FinProceso
