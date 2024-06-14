import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor : Ham khoi tao
        // 1. Ten constructor trung voi ten class
        // 2. Constructor khong co kieu tra ve
        Dog dog1 = new Dog("Long",2);
        System.out.println("dog1 = " + dog1);

        Dog dog2 = new Dog("Ling");
        System.out.println("dog2 = " + dog2);

        // Mac dinh : o tham so
        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);
    }

}
