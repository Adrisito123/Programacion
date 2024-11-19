import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ciclo principal que se repite hasta que el usuario decida salir
        while (true) {
            // Mostrar el menú de opciones
            System.out.println("Elige una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Valor absoluto");
            System.out.println("8.Factorial");
            System.out.println("9.Area de un circulo");
             System.out.println("10. Multiplicar por Pi");
            System.out.println("11. Salir");
            System.out.print("Opción: ");
            
            // Leer la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Si el usuario selecciona la opción 8 (Salir), se termina el programa
            if (opcion == 11) {
                System.out.println("Saliendo de la calculadora...");
                break; // Salir del bucle y finalizar el programa
            }

            // Declarar las variables para almacenar los números que se ingresarán
            double num1, num2;

            // Usar un switch para ejecutar diferentes bloques de código según la opción seleccionada
            switch (opcion) {
                case 1: // Opción 1: Suma
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + suma(num1 , num2));
                    break;

                case 2: // Opción 2: Resta
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + resta(num1 , num2));
                    break;

                case 3: // Opción 3: Multiplicación
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + multiplicacion(num1 , num2));
                    break;

                case 4: // Opción 4: División
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("La division es: " + division(num1 , num2));
                    break;

                case 5: // Opción 5: Potencia
                    System.out.print("Introduce la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el exponente: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;

                case 6: // Opción 6: Raíz cuadrada
                    System.out.print("Introduce el número: ");
                    num1 = scanner.nextDouble();
                    // Verificar que el número no sea negativo
                    if (num1 >= 0) {
                        // Calcular y mostrar la raíz cuadrada usando Math.sqrt()
                        System.out.println("Raíz cuadrada: " + Math.sqrt(num1));
                    } else {
                        // Si el número es negativo, mostrar un mensaje de error
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;

                case 7: // Opción 7: Valor absoluto
                    System.out.print("Introduce el número: ");
                    num1 = scanner.nextDouble();
                    // Calcular y mostrar el valor absoluto usando Math.abs()
                    System.out.println("Valor absoluto: " + Math.abs(num1));
                    break;
                    
                    case 8:
                    System.out.println("Dime un numero:");
                   int num = scanner.nextInt();
                    System.out.println("El factorial de " + num + " es: " + factorial(num));
                    break;
                    
                case 9:
                    System.out.println("Dime el radio de un circulo:");
                    num1 = scanner.nextDouble();
                    System.out.println("El area del circulo es: " + areaCirculo(num1));
                    break;
                    
                case 10:
                    System.out.println("Dime un numero:");
                    num1 = scanner.nextDouble();
                    System.out.println("El numero" + num1 + " x " + " PI = " + multiplicarPorPi(num1));
                    break;

                default: // Si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida, por favor ingresa un número entre 1 y 11.");
                    break;
            }

            System.out.println(); 
        }
    }
        public static long factorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i; // Multiplicar sucesivamente
        }
        return resultado;
    }
            // Función para calcular el área de un círculo
    public static double areaCirculo(double num1) {
        return Math.PI * num1 * num1; // Fórmula del área: π * r²
    }
    // Función para la suma
public static double suma(double num1, double num2) {
    return num1 + num2;
}

// Función para la resta
public static double resta(double num1, double num2) {
    return num1 - num2;
}

// Función para la multiplicación
public static double multiplicacion(double num1, double num2) {
    return num1 * num2;
}

// Función para la división
public static double division(double num1, double num2) {
        return num1/ num2;
    }
    // Función para multiplicar por Pi
    public static double multiplicarPorPi(double num1) {
        final double PI = 3.141592653589793;
        return num1 * PI;
    }
}




