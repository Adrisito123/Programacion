Algoritmo sumar_infinito
	
	Definir num Como Entero
	Definir i Como Entero
	
	acomulador = 0
	
	Escribir sumaracomulador(num)
	
FinAlgoritmo


Funcion sumaracomulador <- sumaracomulador ( num )
	
	Repetir
		Escribir "Dime un número pa sumar:"
		leer num
		acomulador = acomulador + num
	Hasta Que num = 0
	
	Escribir "La suma es: " acomulador
	
Fin Funcion
