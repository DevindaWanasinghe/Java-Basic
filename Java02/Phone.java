public class Phone {
    String name;
    String color;
    int ram;

    public void call() {
        System.out.println("take a call from "+name);
    }
    
    public void browserInternet(){
        System.out.println("browse internet");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(); //calling contructer (create an object related to the class )
        phone1.name = "samsung";
        phone1.color = "black";
        phone1.call();

        Phone phone2 = new Phone(); // create another object
        phone2.name = "iphone";
        phone2.call();


        System.out.println(phone1.color);

        
    }   
  
}