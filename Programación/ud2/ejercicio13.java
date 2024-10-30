
package programacion.ud2;

public class ejercicio13 {
    public static void main (String[]args){
        
        
        boolean num1 = (10  + 5 * 2 > 20 && 4 == 4);
        System.out.println("Es:" + num1);
        
        boolean num2 = !(7 + 3 > 10) ||  3 * 2 <= 6;
        System.out.println("Es:" + num2);
        
        boolean num3 = 10 / 2 + 3 *  5 == 19 && true;
        System.out.println("Es:" + num3);
        
        int x = 5; 
        x += 3 * 2; 
        boolean num4 = (x == 11); 
        System.out.println("Es:" + num4);
        
         boolean b = false; 
        boolean num5 = !b || 7 % 2 == 1; 
        System.out.println("Es:" + num5);
    }
    
}
