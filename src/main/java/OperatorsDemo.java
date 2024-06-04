public class OperatorsDemo {
    public static void main(String[] args) {
        //Toan tu so hoc
        // +, -, *,/, %
        System.out.println(99+2);
        System.out.println(99-2);
        System.out.println(99*2);
        System.out.println(99/2);
        System.out.println(99.0/2); // Luu y
        System.out.println(99%2);

        // +=, -=, *=, /=, %=
        int a =100;
        a += 10;
        System.out.println("a = " + a);

        // ++. --
        int b = 1000;
        b++;
        System.out.println("b = " + b);

        // Chu y
        int c = ++b; // b =b+1 -> int c =b
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int d = b++; // int d =b -> b=b+1
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        // Toan tu quan he
        // ==, >, >=, <, <=,

        // Toan tu logic
        // AND : &&
        // OR : ||
        // Not : !

        boolean ok = b>5 && b<10;
        boolean notTrue = !true;
        System.out.println("ok = " + ok);
        System.out.println("notTrue = " + notTrue);
    }
}
