
package programacion.ud2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main (String[]args){
        boolean lluvia ;
        boolean tarea ;
        boolean otro;
        
        Scanner sc =  new Scanner (System.in);

        System.out.println("  Esta lloviendo");
        System.out.println(" 1.si");
        System.out.println(" 2.no");
        
        int res1 = sc.nextInt();
        
        lluvia = res1 == 2;
        
        System.out.println("  Has hecho la tarea");
        System.out.println(" 1.si");
        System.out.println(" 2.no");
        
        int res2 = sc.nextInt();
        
        tarea = res2 == 1;
        
         System.out.println("Necesitas salir urgente?");
        System.out.println(" 1.si");
        System.out.println(" 2.no");
        
         int res3 = sc.nextInt();
        
         otro = res3 == 1;
        
         if (otro == true){
             System.out.println("Puedes salir");
         } else {
        if (tarea == false ||  lluvia == false){
            System.out.println("No puedes salir");
        } else {
            System.out.println("Puedes salir");
        }
    }
    }
}
