
package ejercicios_ud4;

public class ContadorObjetos {
    //Atributos
    static int totalObjetos = 0;
    
    //Constructor
    public ContadorObjetos(){
        totalObjetos++;
    }
    static void mostrarTotalObjetos(){
        System.out.println("El numero total de objetos creados es: " + totalObjetos);
    }
}
