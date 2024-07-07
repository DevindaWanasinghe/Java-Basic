//stiring part 2
public class Test15 {
    public static void main(String[] args) {
        String str1 = "devinda wanasinghe";
        String str2 = " is a Software Engineer.";
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.err.println(str1.toLowerCase());
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.concat(" ").concat(str2));
        System.out.println(str1.isEmpty());
        System.out.println(str1.replace("devinda","W.M.S.D.")+ str2);
        System.out.println(str1.contains("devinda"));
    }
    
}
