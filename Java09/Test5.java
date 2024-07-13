//Multi Treding - 3 (Runnable interface implement)

class A implements Runnable{
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

class B implements Runnable{
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

public class Test5 {
    public static void main(String[] args) {
        A obj1 = new A();
        Thread o1 = new Thread(obj1);
        o1.start();;
            try{
                Thread.sleep(50);
            }
            catch(Exception e){}
        
        B obj2 = new B();
        Thread o2 = new Thread(obj2);
        o2.start();
    }
    
}
