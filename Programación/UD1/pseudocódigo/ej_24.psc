Algoritmo ej_24
	
	Definir a , b Como Entero
	
	Escribir "Introduzca dos números mayores que 0:"
	leer a
	leer b
	
		Mientras b <> 0 Hacer
			si a > b Entonces
				a = a - b
			SiNo
				b = b - a
			FinSi
		Fin Mientras
	Escribir a
		
FinAlgoritmo
