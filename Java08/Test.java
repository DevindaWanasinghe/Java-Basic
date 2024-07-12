//Object class
class Student {
    String name = "kamal";
    int age = 15;
    void run(){

    }
    void eat(){

    }

}

public class Test extends Student{
    public static void main(String[] args) {
        Test obj = new Test();
        Student s = new Student();
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1.equals(o2));
        
        System.out.println( o1.hashCode());
        System.out.println( o2.hashCode());

        System.out.println(o1.toString());
        System.out.println(o1);

        System.out.println(o1.getClass());

        System.out.println(s.getClass());




        
    }

    
}

