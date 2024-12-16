
package ud3_proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Ud3_Proyecto {

    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        //Array definido con 7 numeros enteros
        int [] tabla = {4,12,55,89,41,28,71};
        
        ordenarArray(tabla);
        
        System.out.println(Arrays.toString(tabla));
        
        //Pedir el numero a buscar
        System.out.println("Dime un numero para buscar en binario:");
        num = sc.nextInt();
        
        if(busquedaBinaria(tabla , num) >= 0){//Si e lnumero en busqueda esta en la tabla y es >= 0 
            System.out.println("Numero encontrado en la  posición: " + busquedaBinaria(tabla, num));//Que te haga la biusqueda binaria
        } else{
            System.out.println("Numero no encontrado");//Si no esta en la tabla o es menor que 0, num no encontrado
        }
        
    }
    //Funcion para buscar en el array de forma binaria
    public static int busquedaBinaria(int [] tabla, int num){
       int izq = 0;//Donde empieza el array
       int drc = tabla.length -1;//Donde acaba el Array
       
       
       while(izq <= drc){
           
           int medio = (izq +(drc - izq) / 2);//Se mete en la variable medio el numero medio del Array
           
           if(tabla[medio] == num){//Si el numero medio dentro del Array es igual al numero que buscamos
               return medio;//Devuelve la posicion del Array
           } else if(tabla[medio] < num){//Si no si el numero medio del Array es menor que el que buscamos
               izq = medio +1;//Devuelve la posicion medio + una posición
           } else{//Si no si el numero medio del Array es mayor que el numero que hemos buscado
               drc = medio -1;//Devuelve la posicion medio - una posicion
           }
       }
       
       
        
        return -1;
        
    }
    //Funcion para ordenar el array
    public static void ordenarArray(int [] tabla){
        java.util.Arrays.sort(tabla);
    }
}
