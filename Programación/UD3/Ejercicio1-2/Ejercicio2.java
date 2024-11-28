package Ejercicios;

public class Ejercicio2 {
	public static void main(String[]args) {
		
		int valor =  10;
		cambiarValor(valor);
		System.out.println("Despues del metodo: " + valor);
		
		int[] array = {10};
		cambiarArray(array);
		System.out.println("Despues del metodo: " + array[0]);
	
	}
	public static void cambiarValor(int numero) {
		numero = 20;
	}
	public static void cambiarArray(int[]array) {
		array[0] = 20;
	}
}

