Algoritmo calificaciones2
	
	Definir nota Como Entero
	
	Escribir "Dime tu nota:"
	leer nota
	
	Segun nota Hacer
		0,1,2,3,4:
			Escribir "Usted tiene un insuficiente"
		5:
			Escribir "Usted tiene un suficiente"
		6:
			Escribir "Usted tiene un bien"
		7,8:
			Escribir "Usted tiene un notable"
		9,10:
			Escribir "Usted tiene un sobresaliente"
		De Otro Modo:
			Escribir "Esa nota no existe"
	Fin Segun
	
FinAlgoritmo
