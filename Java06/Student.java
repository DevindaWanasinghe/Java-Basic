//this key word
public class Student {
    String name;
    int age;

    /* 
    Student(String x, int y){
        name = x;
        age = y;
    }
    */

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student obj = new Student("devinda", 21);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
   
}
