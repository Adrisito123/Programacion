package ejercicios_ud4;

import java.util.Scanner;

public class horaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minuto = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundo = sc.nextInt();

        Hora horaObj = new Hora(hora, minuto, segundo);

        System.out.print("Hora inicial: ");
        horaObj.mostrarHora();

        System.out.print("Introduce la cantidad de segundos a añadir: ");
        int segundosAAnadir = sc.nextInt();

        horaObj.sumarSegundos(segundosAAnadir);
        System.out.print("Hora después de añadir los segundos: ");
        horaObj.mostrarHora();
        
    }
}
