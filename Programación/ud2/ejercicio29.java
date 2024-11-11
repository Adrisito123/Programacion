
package programacion.ud2;

public class ejercicio29 {
    public static void main (String[]args){
        
        
        for (int i = 0; i <= 10; i++) {
            System.out.println( "\nTabla del " + i);
            for (int j = 0; j <= 10; j++) {
                int multi = i * j;
                System.out.println(i  + "x" + j + " = " + multi);
                
            }
        }
        
    }
        
}
