
Algoritmo calculadora
	
	Definir operacion Como Entero
	Definir numero1 Como Entero
	Definir numero2 Como Entero
	
	Escribir "CALCULADORA"
	Escribir "Elige lo que quieres realizar:"
	Escribir "1.Suma"
	Escribir "2.Resta"
	Escribir "3.Multiplicación"
	Escribir "4.División"
	Escribir "5.Raiz Cuadrada"
	Escribir "6.Potencia"
	Escribir "7.Seno"
	Escribir "8.Coseno"
	Escribir "9.Tangente"
	Leer operacion
	
	Si operacion > 0 & operacion <= 9 Entonces
		Segun operacion  Hacer
			1:
				Escribir "Dime el primer número:"
				leer numero1
				Escribir "Dime el siguiente número:"
				leer numero2
				resultado = numero1 + numero2
			2:
				Escribir "Dime el primer número:"
				leer numero1
				Escribir "Dime el siguiente número:"
				leer numero2
				resultado = numero1 - numero2
			3:
				Escribir "Dime el primer número:"
				leer numero1
				Escribir "Dime el siguiente número:"
				leer numero2
				resultado = numero1 * numero2
			4:	
				Escribir "Dime el primer número:"
				leer numero1
				Escribir "Dime el siguiente número:"
				leer numero2
				resultado = numero1 /  numero2
			5:
				Escribir "Dime el primer número:"
				leer numero1
				resultado = Raiz(numero1)
			6:
				Escribir "Dime un numero:"
				leer numero1
				Escribir "Dime la potencia que quieras calcular:"
				leer numero2
				resultado = numero1  ^ numero2 
			7:
				Escribir "Dime un numero:"
				leer numero1
				resultado = sen(numero1)
			8:
				Escribir "Dime el primer número:"
				leer numero1
				resultado = cos(numero1) 
			9:
				Escribir "Dime un numero:"
				leer numero1
				resultado = tan(numero1)
				
		Fin Segun
			Escribir "El resultado es: " resultado
	SiNo  
		Escribir "Ese numero seleccionado no vale"
	FinSi
	
FinAlgoritmo

