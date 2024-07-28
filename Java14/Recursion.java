public class Recursion {
    int i = 0; 
    public void display(){
        System.out.println("Hello!"+i);
        i++;
        if (i<10) {
            display();   
        } 
    }
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        obj.display();
        
    }
    
}
