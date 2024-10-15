Algoritmo Triángulos
	
	Definir num1 Como entero
	Definir num2 Como entero
	Definir num3 Como entero
	
	Escribir "Dime el primer número:"
	leer num1
	Escribir "Dime el segundo número:"
	leer num2

	Escribir "Dime el tercer número:"
	leer num3
	
	
	Si (num1 + num2 >= num3) y (num1 + num3 >= num2) y (num2 + num3 >= num1) Entonces
		Si num1 = num2 y num2 = num3  Entonces
			Escribir "Es un triángulo EQUILÁTERO"
			
		SiNo
			Si num1 = num2 y num2 <> num3 Entonces
				Escribir "Esto es un triángulo ISÓSCELES"
		
			SiNo
				Escribir "Es un triángulo ESCALENO"
			FinSi
			FinSi
	SiNo
			Escribir "No es un triangulo"
	Finsi	
	
FinAlgoritmo
