Algoritmo Contarnumero2
	
	Definir num Como Entero
	Definir i Como Entero
	
	Escribir "Dime hasta que número quieres contar:"
	leer num 
	
	si num > 0 Entonces
		i = 0
		Repetir
			Escribir i
			i = i + 1
		Hasta Que i > num
	SiNo
		Escribir "No vale ese numero"
	FinSi
	

FinAlgoritmo
