//Multi Treding -2 (Thred class inherit)

class A extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            {
                System.out.println("Hello");
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){}
            }

        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            {
                System.out.println("Welcome");
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){}
            }
        }
    }
}
public class Test4 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.start();;
            try{
                Thread.sleep(50);
            }
            catch(Exception e){}
        
        B obj2 = new B();
        obj2.start();
    }
    
}
