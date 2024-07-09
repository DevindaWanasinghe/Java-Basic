//Abstract --> Callig interface in the methods

public class Test07 implements Test06 {
    public void eat(){
        System.out.println("Eating");
    }

    public void drink(){
        System.out.println("Drinking");
    }

    public void run(){
        System.out.println("Running");
    }  
    
    public static void main(String[] args) {
        Test07 obj = new Test07();
        obj.eat();
        System.out.println(Test07.number);

        Test06 obj1 = new Test07();
        obj1.run();
        System.out.println(Test06.number);
        // Test06.number = 15;
    }
}
