package programacion.ud2;

import java.util.Scanner;

public class EntradaDatos {
    public static void main (String[] args) {
        int num;
        System.out.println("Dime tu edad: ");
        Scanner sc = new Scanner(System.in);
        num  = sc.nextInt();
        System.out.println("El año que viene tendras: " + (num + 1));

    }
}