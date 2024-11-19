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
            System.out.println("8. Factorial");
            System.out.println("9. Área de un círculo");
            System.out.println("10. Multiplicar por Pi");
            System.out.println("11. Salir");
            System.out.print("Opción: ");
            
            // Leer la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Si el usuario selecciona la opción 11 (Salir), se termina el programa
            if (opcion == 11) {
                System.out.println("Saliendo de la calculadora...");
                break; // Salir del bucle y finalizar el programa
            }

            // Usar un switch para ejecutar diferentes bloques de código según la opción seleccionada
            switch (opcion) {
                case 1: // Opción 1: Suma
                    suma(scanner);
                    break;

                case 2: // Opción 2: Resta
                    resta(scanner);
                    break;

                case 3: // Opción 3: Multiplicación
                    multiplicacion(scanner);
                    break;

                case 4: // Opción 4: División
                    division(scanner);
                    break;

                case 5: // Opción 5: Potencia
                    potencia(scanner);
                    break;

                case 6: // Opción 6: Raíz cuadrada
                    raizCuadrada(scanner);
                    break;

                case 7: // Opción 7: Valor absoluto
                    valorAbsoluto(scanner);
                    break;

                case 8: // Opción 8: Factorial
                    factorial(scanner);
                    break;

                case 9: // Opción 9: Área de un círculo
                    areaCirculo(scanner);
                    break;

                case 10: // Opción 10: Multiplicar por Pi
                    multiplicarPorPi(scanner);
                    break;

                default: // Si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida, por favor ingresa un número entre 1 y 11.");
                    break;
            }

            System.out.println(); 
        }
    }
    public static void suma(Scanner scanner){
         double num1;
         double num2;
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 + num2));
    }
    public static void resta(Scanner scanner){
        double num1;
        double num2;
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 - num2));
    }
    public static void multiplicacion(Scanner scanner){
        double num1;
        double num2;
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 * num2));
    }
    public static void division(Scanner scanner){
        double num1;
        double num2;
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();
            if (num2 != 0) {
                        System.out.println("La división es: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
    }
    public static void potencia(Scanner scanner){
        double num1;
        double num2;
        System.out.print("Introduce la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el exponente: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
    }
     public static void raizCuadrada(Scanner scanner){
        double num1;
        double num2;
        System.out.print("Introduce el número: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Raíz cuadrada: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
    }
     public static void valorAbsoluto(Scanner scanner){
        double num1;
        System.out.print("Introduce el número: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Valor absoluto: " + Math.abs(num1));
    }
     public static void factorial(Scanner scanner){
        double num1;
        System.out.print("Dime un número: ");
                    num1 = scanner.nextInt();
                    long factorialResult = 1;
                    if (num1 < 0) {
                        System.out.println("Error: El factorial no está definido para números negativos.");
                    } else {
                        for (int i = 1; i <= num1; i++) {
                            factorialResult *= i;
                        }
                        System.out.println("El factorial de " + num1 + " es: " + factorialResult);
        }
     }
      public static void areaCirculo(Scanner scanner){
        double num1;
        System.out.print("Dime el radio del círculo: ");
                    num1 = scanner.nextDouble();
                    double area = Math.PI * num1 * num1;
                    System.out.println("El área del círculo es: " + area);
    }
      public static void multiplicarPorPi(Scanner scanner){
        double num1;
        System.out.print("Dime un número: ");
                    num1 = scanner.nextDouble();
                    System.out.println("El número " + num1 + " x PI = " + (num1 * Math.PI));
    }
}
