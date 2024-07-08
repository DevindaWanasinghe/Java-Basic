//method overriding
public class Child extends Parent{

    public void Phone(){
        System.out.println("Nokia");
    }
  
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Phone();
    }   
}
