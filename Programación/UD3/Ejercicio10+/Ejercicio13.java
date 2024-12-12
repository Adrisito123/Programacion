package Ejercicios;

public class Ejercicio13 {

    public static void main(String[] args) {

        boolean resultado;
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 ={1,2,3,4};

        resultado = compararArrays(array1, array3);

        System.out.println(resultado);

    }

    public static boolean compararArrays(int[] array1, int[] array2) {
        boolean resultado = true;
        int i = 0;
        
        if(array1.length != array2.length){
            resultado = false;
        }
        
        while (i < array1.length && resultado) {
            if (array1[i] != array2[i]) {
                resultado = false;
            }
            i++;
        }
        return resultado;

    }

}
