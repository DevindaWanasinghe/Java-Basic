public class Kamal extends Nimal {
    void drink(){
        System.out.println("drinking");
    }
    void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Kamal obj = new Kamal();
        obj.drink();
        obj.run();
        obj.eat();
    }
    
}
