import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Juan", "José");

        // Usando lambda para ordenar en orden alfabético inverso
        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println("Nombres ordenados en orden inverso: " + names);
    }
}