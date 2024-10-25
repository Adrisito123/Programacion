
package programacion.ud2;

public class ejercicio4 {
    public static  void main (String[]args){
        short numMax = 32767;
        short numMin = -32768;
        
        numMax = (short) (numMax + 1);
        numMin = (short)  (numMin - 1);
        
        System.out.println(numMax);
        System.out.println(numMin);
           
    }
    
}
