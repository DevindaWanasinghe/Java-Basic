public class Test03 {

    void call(String name){ //given variable int0 method
        System.out.println("take a call from "+name);
    } 
    
    public static void main(String[] args) {
        Test03 phone1 = new Test03();
        phone1.call("nokia"); // give value to method
        phone1.call("samsung");
    }
}
