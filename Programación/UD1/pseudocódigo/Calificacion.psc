Algoritmo Calificacion				
	
	Definir nota Como Entero
	
	Escribir "Dime tu nota del trimestre: "
	leer nota
	
	Si nota <= 4 Entonces
		Escribir "Usted tiene un insuficiente"
	Fin Si
	Si nota = 5 Entonces
		Escribir "Usted tiene un suficiente"
	FinSi
	Si nota = 6 Entonces
		Escribir "Usted tiene un "
	FinSi
	Si nota >= 7 o nota >= 8 Entonces
			Escribir "Usted tiene un notable"
		FinSi
		Si nota >= 9 o nota >= 10 Entonces
			Escribir "Usted tiene un sobresaliente"
		FinSi
FinAlgoritmo
