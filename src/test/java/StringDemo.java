public class StringDemo {
    public static void main(String[] args) {
        //Primitive
        String s1 = "Java Core";
        String s2 = "Java Core";

        // Non primitive
        String s3 = new String("Java Core");
        String s4 = new String("Java Core");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s3)); //true



    }
}
