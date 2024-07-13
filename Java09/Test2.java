//Java Genarics
public class Test2<T, K> {
    
    @SuppressWarnings("unchecked")
 
    T[] arr = (T[]) new Object[3];
    

    public static void main(String[] args) {
        Test2<String, Integer>  obj = new Test2<>();
        obj.arr[0] = "32";
        obj.arr[1] = "hellow";

        for (String s : obj.arr) {
            System.out.println(s);
        }

    }
}

