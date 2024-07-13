//Sybchoronization - multithreading 

class Display{
    void print(){  //set "synchronized" word
    
        Thread t = Thread.currentThread(); //create now workink tread 

        synchronized (this){
            for(int i =0; i<5; i++){
                try{
                    Thread.sleep(500);
                    System.out.println(t.getName());
                }
                catch(Exception e){} 
            }
        }
      
    }

}

class T extends Thread{ //inherit Thread class
    Display c; //Create display object
    T(Display c){ //Create Constrcter
        this.c = c;

    }

    public void run(){
        c.print();

    }

}

public class Test6 {
    public static void main(String[] args) {
        Display obj1 = new Display();

        T t1 = new T(obj1);
        T t2 = new T(obj1);

        t1.start();
        t2.start();
        //System.out.println(Thread.currentThread().getName());

        
    }
    
}
