
package programacion.ud2;

public class ejercicio31 {
    public  static int variosSaludos(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hola"); 
        }
        return 0;
    }
    public static int suma (int x , int y){
        int resultado = x + y;
        return resultado;
    }
    public static void main(String[]args){

        int n = 5;
        variosSaludos(n);
        
        int s = suma(2,3);
        System.out.println(s);
    }
}
