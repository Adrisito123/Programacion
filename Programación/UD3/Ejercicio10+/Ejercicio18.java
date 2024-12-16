
package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        
        String frase;
        char c;
        int cont = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una frase con espacios:");
        frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
          c = frase.charAt(i);
            if(c == ' '){
                cont++;
            }
        }
        
        System.out.println("La frase " + frase + " tiene " + cont + " espacios");
        
    }
    
}
