public class Test02 {
    String name;

    void call(){
        System.out.println("take a call from "+name);
    }

    public static void main(String[] args) {
        Test02 phone1 = new Test02();
        Test02 phone2 = new Test02();
        Test02 phone3 = new Test02();

        phone1.name = "nokia";
        phone2.name = "samsung";
        phone3.name = "huawei";

        phone2.call();
        phone1.call();

    }
    
}
