Algoritmo ej_25
	Escribir  "Ingrese un numero:"
	Leer  n
	Escribir  "Ingrese el divisor:"
	Leer  m
	Si n mod m = 0 Entonces
		Escribir  m ," es divisor exacto de " ,n
	SiNo
		Escribir "El resto de divisor ", n " por " , m ," es: " , n mod m
	FinSi
FinAlgoritmo
