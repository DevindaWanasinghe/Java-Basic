//Single Inheritance
public class newPhone extends oldPhone {
    void browseInternet(){
        
    }
    public static void main(String[] args) {
        newPhone obj2 = new newPhone();
        obj2.call();
        System.out.println(obj2.name);
    }
    
}
