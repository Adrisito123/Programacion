
package programacion.ud2;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int mayor;
        int mediano;
        int pequeno;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero:");
        num1 = sc.nextInt();

        System.out.println("Dime el segundo numero:");
        num2 = sc.nextInt();

        System.out.println("Dime el tercer numero:");
        num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                mediano = num2;
                pequeno = num3;
            } else {
                mediano = num3;
                pequeno = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                mediano = num1;
                pequeno = num3;
            } else {
                mediano = num3;
                pequeno = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                mediano = num1;
                pequeno = num2;
            } else {
                mediano = num2;
                pequeno = num1;
            }
        }

        System.out.println(mayor + " > " + mediano + " > " + pequeno);
}
}