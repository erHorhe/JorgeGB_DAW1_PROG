Proceso Ejercicio5_2
	Definir numDiaSemana Como Entero
	Escribir Sin Saltar '¿En qué día de la semana estamos?'
	Leer numDiaSemana
	Si numDiaSemana = 1 Entonces
		Escribir 'Lunes.'
	SiNo
		Si numDiaSemana = 2 Entonces
			Escribir 'Martes.'
		SiNo
			Si numDiaSemana = 3 Entonces
				Escribir 'Miércoles.'
			SiNo
				Si numDiaSemana = 4 Entonces
					Escribir 'Jueves.'
				SiNo
					Si numDiaSemana = 5 Entonces
						Escribir 'Viernes.'
					SiNo
						Si numDiaSemana = 6 Entonces
							Escribir 'Sábado.'
						SiNo
							Si numDiaSemana = 7 Entonces
								Escribir 'Domingo.'
							SiNo
								Escribir 'Eso no es ningún día de la semana...'
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso
