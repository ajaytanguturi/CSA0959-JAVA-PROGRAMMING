import java.util.HashSet;
import java.util.Iterator;

public class Hashsetadd {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Integer firstElement = 10;
        System.out.println("HashSet: " + numbers);
        System.out.println("First element added: " + firstElement);
    }
}
