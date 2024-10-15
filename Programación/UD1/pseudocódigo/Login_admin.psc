Algoritmo Login_admin
	
	Definir login Como Caracter
	Definir pass Como Entero
	
	Escribir "Hóla señor Admin  Introduzcan tus datos:"
	Escribir "Login:"
	leer login
	Si login = "Adrián Aránegas Molina" Entonces
		Escribir "Contraseña:"
		leer pass
		Si pass = 1234 Entonces
			Escribir "Bienvenido de nuevo Adrián"
		SiNo 
			Escribir "Contraseña Incorrecta"
		FinSi
	SiNo
		Escribir "Nombre de usuario incorrecto"
	Fin Si

FinAlgoritmo
