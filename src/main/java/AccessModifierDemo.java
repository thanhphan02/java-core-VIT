import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Pham vi truy cap
        // public: Moi noi
        Dog dog1 = new Dog("Long",2);
        System.out.println("dog1.name = " + dog1.name);

        // protected: Cung package hoac class con
        Dog dog2 = new Dog("Long",2);
         //System.out.println("dog2.age = " + dog2.age);

        // defaul: Cung package
        Dog dog3 = new Dog("Long",2);
         //System.out.println("dog3.color = " + dog3.color);

        // private: Cung class
        Dog dog4 = new Dog("Long",2);
         //System.out.println("dog4.id = " + dog4.id);
    }
}
