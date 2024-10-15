Algoritmo par_impar_procedimiento
		
		Definir num Como  entero
		Definir resultado como entero	
		
		Escribir "Dime un numero: "
		leer num
		
		parimpar(num)
		
FinAlgoritmo

Funcion  parimpar(num)
	Si num mod  2 = 0 Entonces
		Escribir "el numuero ", num ," es par"
	SiNo
		Escribir "el numuero ", num ," es impar"
	Fin Si
Fin Funcion

