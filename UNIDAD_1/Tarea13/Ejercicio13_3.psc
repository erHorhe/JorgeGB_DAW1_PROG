Proceso Ejercicio13_3
	Definir num Como Entero
	Escribir Sin Saltar 'Dime un número:'
	Leer num
	Escribir EsPar(num)
FinProceso

Funcion par=EsPar(n1)
	Definir par como Logico
	Si n1%2=0 entonces
		par = Verdadero
	SiNo
		par = Falso
	FinSi
FinFuncion
	