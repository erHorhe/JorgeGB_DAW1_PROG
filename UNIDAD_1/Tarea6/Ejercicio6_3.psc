//Crea un programa que genere dos n�meros al azar entre el 0 y el 100, y pida al usuario que calcule e introduzca su suma.
//Si la respuesta no es correcta, deber� volver a pedirla tantas veces como sea necesario hasta que el usuario acierte.
//Pista: como ver�s en el apartado 10, para generar un n�mero al azar del 0 al 100 puedes hacer numero <- AZAR(101)
Proceso Ejercicio6_3
	Definir num1 Como Entero
	Definir num2 Como Entero
	num1 <- azar(101)
	num2 <- azar(101)
	Definir sumaUsuario Como Entero
	
	Escribir 'N�mero 1: ',num1
	Escribir 'N�mero 2: ',num2	
	
	Escribir '�Cu�l es la suma de ambos n�meros?'
	Leer sumaUsuario
	Mientras sumaUsuario != num1+num2 Hacer
		Escribir 'NO ES CORRECTA LA SUMA.'
		Leer sumaUsuario
	FinMientras
	
	Si sumaUsuario = num1+num2 Entonces
		Escribir num1,' + ',num2,' = ',sumaUsuario
	FinSi
FinProceso
