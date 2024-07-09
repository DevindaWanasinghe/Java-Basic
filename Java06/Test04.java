//Final Key word using methods

class Parent{
    final public void say(){
        System.out.println("Haii");
    }
}

class Child extends Parent{
    /*
    public void say(){
        System.out.println("Hello!");
    }
    */
}

public class Test04 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.say();


        final double g = 9.81;
        //g = 20;
        System.out.println(g);
    }
    
}
