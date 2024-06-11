import java.util.Scanner;

public class Exercise04 {
    void question01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao xau ki tu.");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count =0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
            }
        System.out.println("So tu " + count);
    }
    String question10(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 !=  length2) {
            return "KO";
        }
        for (int i = 0; i < length1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1 - 1 - i);
            if (c1 != c2) {
                return "KO";
            }
        }
        return "OK";
    }
    String question15(String s){
        String[] words =s.split(" ");
        String result = "";
    }
}

