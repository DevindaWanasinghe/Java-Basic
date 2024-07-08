//static and non static variables and methods
public class Test01 {
    int x;
    static int y;

    void meth1(){

    }

    static void meth2(){

    }

    public static void main(String[] args) {
        y =5;
        meth2();

        Test01 obj = new Test01();
        obj.x = 4;
        obj.meth1();
    }
    
}
