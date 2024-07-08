//method overloading
public class Meth_Overloading {
    public void meth(){
        System.out.println("method 1");
    }

    public void meth(int x){
        System.out.println("method 2");
    }
    public void meth(int x,int y){
        System.out.println("method 3");
    }
    public void meth(double x){
        System.out.println("method 4");
    }

    public static void main(String[] args) {
        Meth_Overloading obj1 = new Meth_Overloading();
        obj1.meth();
        obj1.meth(10);
        obj1.meth(5,10);
        obj1.meth(10.5);
    }
    
}
