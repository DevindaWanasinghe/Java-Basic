public class Arguments {
    public static void totalMarks(int mark1, int mark2, int mark3){
        int totalMarks = mark1 + mark2 + mark3;
        System.out.println(totalMarks);
    }
    public static void totalMarks(int mark1, int mark2){
        int totalMarks = mark1 + mark2;
        System.out.println(totalMarks);
    }
    public static void totalMarks(int mark1){
        int totalMarks = mark1;
        System.out.println(totalMarks);
    }
    public static void main(String[] args) {
        totalMarks(65, 78);
    }
    
}
