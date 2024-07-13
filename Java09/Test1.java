//JaVA Genaricss


public class Test1{
    public static void main(String[] args) {
        Object arr[] = new Object[3];

        arr[0] = 23;
        arr[1] = 34;
        arr[2] = "hello";

        int number;
        for(int i = 0; i<3; i++){
            number = (Integer)arr[i];
            System.out.println(number);
        }   
    }
 
}
