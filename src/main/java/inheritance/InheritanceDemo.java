package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tinh ke thua
        // Muc dich : Tai su dung code
        //tu khoa : extends
        Duck duck1 = new Duck("Long",2);
        duck1.eat();

        // @Override: Ghi de
        duck1.eat();

        // Tu khoa :super
        duck1.eat();
        System.out.println("duck1 = " + duck1);

        // Don ke thua

    }
}
