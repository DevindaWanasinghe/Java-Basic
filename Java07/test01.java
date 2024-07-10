//super keyword
class A{
    int x = 10;

    void show(){
        System.out.println("hi");
    }

}

class B extends A{
    int x = 15;
    public void print(){
        System.out.println(super.x);
    }

    void show(){
        super.show();
        System.out.println("hello");
    }

}

public class test01 {
    public static void main(String[] args) {
        B obj = new B();
        //System.out.println(obj.x);
        //obj.print();
        obj.show();

        
    }
    
}
