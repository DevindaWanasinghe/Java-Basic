public class Arguments2 {
    public static void totalMarks(int ...marks){
        int totalMarks = 0;

        // for(int mark: marks){
        //     totalMarks+= mark;
        //     System.out.println(totalMarks);
        //}

        for(int i=0; i<marks.length; i++){
            totalMarks+= marks[i];  
        }
        System.out.println(totalMarks);
       
    }
    public static void main(String[] args) {
        totalMarks(76,7,35,73,45,7,54,32);
        
    }
    
}
