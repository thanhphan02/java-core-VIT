public class OutputDemo {
    public static void main(String[] args) {
        //Escape characters
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> Xuong dong
        // \t -> Tap


        //System.out.println
        System.out.println("Java Core");
        System.out.println("Java Core");
        System.out.println("Java Core");

        // System.out.print
        System.out.print("\tJava Core\n");
        System.out.print("Java Core\n");
        System.out.print("Java Core\n");

        // System.out.printf
        // %s: Dai dien cho String
        // %d: Dai dien cho so nguyen
        // %f: Dai dien cho so thuc
        // %c: Dai dien cho ki tu
        // %n: Xuong dong
        System.out.printf("Ho ten: %s, tuoi: %d.%n,","Khoa",20);
        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 1, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");
        // Gom nhom, lam tron
        double money =12345654321.789;
        System.out.printf("money = %.2f%n", money);
        System.out.printf("money = %,f%n", money);
        System.out.printf("money = %,.2f%n", money);
    }
}
