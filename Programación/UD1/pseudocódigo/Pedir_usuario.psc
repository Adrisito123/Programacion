Algoritmo Pedir_usuario
	
	Definir usuario Como Caracter
	Definir contrasena Como entero
	
	Escribir "Introduzca el nombre y la contraseña para acceder al sistema!"
	Escribir "Usuario"
	leer usuario
	Si usuario = "Adrian" Entonces
		Escribir "Introduce contraseña:"
		leer contrasena
		Si contrasena = 1234 Entonces
			Escribir "¡Bienvenido Adrián !"
		SiNo
			Escribir "Contraseña Incorrecta!!"
		Fin Si
	SiNo
		Escribir "Usuario Incorrecto!!"
	Fin Si
	
FinAlgoritmo
