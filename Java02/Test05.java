public class Test05 {
    int rupee;

    Test05(){
        rupee = 0;

    }
    Test05(int x){
        rupee = x;
    }

    public static void main(String[] args) {
 
        //constructer overloading
        Test05 kamal = new Test05();
        Test05 nimal =  new Test05(20);

        System.out.println(nimal.rupee);
        System.out.println(kamal.rupee);
    }
}