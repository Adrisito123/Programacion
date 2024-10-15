
Algoritmo par_impar_funcion
	
	Definir num Como  entero
	Definir resultado como logico
	
	Escribir "Dime un numero: "
	leer num
	
	resultado = parimpar(num)
	
	Si resultado = Verdadero Entonces
		Escribir "Es par"
	SiNo
		Escribir "Es impar"
	FinSi

FinAlgoritmo

Funcion resultado  = parimpar(num)
	Si num mod 2 = 0 Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
Fin Funcion
