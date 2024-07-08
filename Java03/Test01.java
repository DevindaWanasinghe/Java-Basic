//java constructer
public class Test01 {
    String name;

    Test01(){ //constructer not a return type
        name = "kamal";
        System.out.println("welcome");
    }

    void meth(){ //create method
        System.out.println("hello");

    }
    public static void main(String[] args) {
        Test01 obj = new Test01(); // calling constructer
        obj.meth();
        System.out.println(obj.name);
       
        Test01 obj1 = new Test01();
        System.out.println(obj1.name);
       
    }
    
}
