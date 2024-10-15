Algoritmo tabla_infinita
	
		Definir num Como entero	
		Definir i Como Entero
		Definir resultado Como Entero
		
		Repetir
			Escribir "Dime un numero del 1-10 para hacerte la tabla"
			leer num 
			Si num <> 0 entonces

				Para i = 0 Hasta 10 Con Paso 1 Hacer
					resultado = i * num
					Escribir num, " x " i, " = " resultado
				Fin Para
			FinSi
			
		Hasta Que num = 0
		
	

FinAlgoritmo
	
