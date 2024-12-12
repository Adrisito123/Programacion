package Ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {
        String a = "Me llamo Adrian";
        String b = "tengo un total de 19 años";

        if (a.length() > b.length()) {
            System.out.println("La cadena menor es: " + b);
        } else if (a.length() < b.length()) {
            System.out.println("La cadena menor es: " + a);
        } else {
            System.out.println("Las cadenas tienen la misma longitud");
        }
    }
}
