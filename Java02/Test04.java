//java constructer
public class Test04 {
    String name;

    Test04(){ //constructer not a return type
        name = "kamal";
        System.out.println("welcome");
    }

    void meth(){ //create method
        System.out.println("hello");

    }
    public static void main(String[] args) {
        Test04 obj = new Test04(); // calling constructer
        obj.meth();
        System.out.println(obj.name);
       
        Test04 obj1 = new Test04();
       
    }
    
}
