
import java.util.HashSet;
import java.util.Set;

public class Ejemplos {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("HashSet: " + numbers);
        System.out.println("Dentro: " + numbers.hashCode());

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(1);
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(4);
        primeNumbers.add(5);
        System.out.println("HashSet2: " + primeNumbers);
        System.out.println("Dentro: " + primeNumbers.hashCode());

        boolean result = numbers.containsAll(primeNumbers);
        System.out.println(result);

    }
}