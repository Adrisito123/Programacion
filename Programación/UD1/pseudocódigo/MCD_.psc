Algoritmo MCD1
	
	Definir num1 Como Entero
	Definir num2	Como Entero
	Definir mcd como entero
	
	Escribir "Dime el primer numero: "
	leer num1
	Escribir "Dime el segundo numero: "
	leer num2
	
	Mientras num2 <> 0 Hacer
		si num1 > num2 Entonces
			num1 = num1 - num2
		SiNo
			num2 = num2 - num1
		FinSi
	Fin Mientras
	
	Escribir "El mcd de " , num1 ," y ", num2 , " es: " ,  mcd	
	
FinAlgoritmo
