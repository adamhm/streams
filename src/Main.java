import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        
        myList
            .stream()
            .filter(item -> item.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList())
            .forEach(System.out::println);
            
        //System.out.println(itemStartsWithC);
    }
}
