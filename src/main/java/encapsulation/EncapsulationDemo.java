package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tinh dong goi: che dau du lieu
        // 1. Private cac thuoc tinh
        // 2. Cung cap getter
        Cat cat = new Cat("Long", 2);
        cat.setAge(-100);
        System.out.println(cat);
    }

}

