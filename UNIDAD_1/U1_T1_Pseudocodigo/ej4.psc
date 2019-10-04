//Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
//A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7.
//Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
//
//Ejemplo:
//	159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
//¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
//	159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
Proceso Entregable4
	Definir array, i, respuesta Como Entero
	
	Dimension array[20]
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		array[i] = AZAR(401)
		Escribir i+1, 'º número: ', array[i]
	FinPara
	
	Escribir Sin Saltar '¿Quiere resaltar los múltiplos de 5 o los múltiplos de 7? '
	Leer respuesta //1 (los múltiplos de 5) - 2 (los múltiplos de 7)
	
	Segun respuesta hacer
		Opcion 1:
			Para i<-0 hasta 19 con paso 1 hacer
				Si array[i]%5=0 entonces
					Escribir Sin Saltar '[',array[i],'] '
				SiNo
					Escribir Sin Saltar array[i], ' '
				FinSi
			FinPara
		Opcion 2:
			Para i<-0 hasta 19 con paso 1 hacer
				Si array[i]%7=0 entonces
					Escribir Sin Saltar '[',array[i],'] '
				SiNo
					Escribir Sin Saltar array[i], ' '
				FinSi
			FinPara
	FinSegun
FinProceso
