//ArrayList 
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(5);
        arr.add(30);
            System.out.println(arr);
        arr.add(0, 99);
            System.out.println(arr);
            System.out.println(arr.contains(300));

            System.out.println(arr.get(2));

            System.out.println(arr.indexOf(5));
        arr.set(1, 50);
            System.out.println(arr);
            System.out.println(arr.size());

        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

        for(Integer x:arr){
            System.out.println(x);
        }

        arr.forEach(x -> System.out.println(x));  

    }

}
