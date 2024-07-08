public class Test02 {
    int rupee;

    Test02(){
        rupee = 0;

    }
    Test02(int x){
        rupee = x;
    }

    public static void main(String[] args) {
 
        //constructer overloading
        Test02 kamal = new Test02();
        Test02 nimal =  new Test02(20);

        System.out.println(nimal.rupee);
        System.out.println(kamal.rupee);
    }
}