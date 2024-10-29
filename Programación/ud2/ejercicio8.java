
package programacion.ud2;

public class ejercicio8 {
    public static void main (String[]args){
        
        
        boolean resultado1 = (3 <= 5 && 2 == 2);
        System.out.println("La segunda operacion es:" + resultado1);
        
        boolean resultado2 = (3 <= 5 && 2  > 10);
        System.out.println("La segunda operacion es:" + resultado2);
        
        boolean resultado3 = (1 != 2 || 5 < 3);
        System.out.println("La segunda operacion es:" + resultado3);
       
       boolean resultado4 = (!(1 < 2));
        System.out.println("La segunda operacion es:" + resultado4);
    }
    
}
