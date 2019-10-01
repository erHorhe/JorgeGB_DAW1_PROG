Proceso Ejercicio13_2
	Definir num1, num2 como Entero
	Escribir "Introduce dos números enteros:"
	Leer num1,num2
	Escribir "¿Alguno de los números es múltiplo del otro? ", EsMultiplo(num1,num2)
FinProceso

Funcion multiplo=EsMultiplo(n1,n2)
	Definir multiplo Como Logico
	Si n1%n2=0 o n2%n1=0 Entonces
		multiplo = Verdadero
	SiNo
		multiplo = Falso
	FinSi
FinFuncion
	