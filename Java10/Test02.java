//linked List
import java.util.LinkedList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>(List.of(1,2,3)); //not asign array value size

        arr.add(12);
            System.out.println(arr);
            System.out.println( arr.contains(12));

            System.out.println(arr.get(2));
            // System.out.println(arr.indexOf(3));

        arr.forEach(n -> System.out.println(n*10));

        arr.forEach(n -> {
            System.out.println(n);
        });

    }
    
}
