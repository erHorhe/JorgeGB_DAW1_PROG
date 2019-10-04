//Escribe un algoritmo que calcule el sueldo semanal de un trabajador teniendo en cuenta lo siguiente:
//		
//-> El sueldo para las primeras 40 horas es 10€.
//			
//-> A partir de la hora 41 (incluida) el trabajado cobrará 15€ la hora.
//			
//Por ejemplo:
//			
//Introduzca el número de horas trabajadas durante la semana: 36
//El sueldo semanal que le corresponde es de 360.
//			
//Introduzca el número de horas trabajadas durante la semana: 50
//El sueldo semanal que le corresponde es de 550.
Proceso Entregable1
	Definir numHoras, i Como Entero
	Escribir '¿Cuántas horas trabaja el empleado?'
	Leer numHoras
	Si numHoras<=40 Entonces
		Escribir 'El sueldo es de ', numHoras*10
	SiNo
		Si numHoras>=41 Entonces
			Escribir (40*10)+((numHoras-40)*15)
		FinSi
	FinSi
FinProceso
