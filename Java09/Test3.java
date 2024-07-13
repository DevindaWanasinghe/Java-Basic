//Multi Treding -1

/* 
class A extends Thread{
    public void run(){  //run();
        System.out.println("Hello");
    }
}

public class Test3 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.start();  //start();
    }
    
}
*/

class A implements Runnable{ //Implement Runnable
    public void run(){  //run();
        System.out.println("Hello");
    }
}

public class Test3 {
    public static void main(String[] args) {
        A obj1 = new A();
        Thread o = new Thread(obj1); //Create Thread Object
        o.start();  //start();
    }
    
}
