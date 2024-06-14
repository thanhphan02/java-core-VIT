package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tinh truu tuong
        // Abstract class
        // Truu tuong khong hoan toan (<100%)
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());
        // Khong the khoi tao doi tuong
        // Shape shape = new Shape();

        // Interface
        // Truu tuong hoan toan (100%)
        // Mac dinh : public abstract
        // Da ke thua
        circle.draw();
        circle.extend();
    }
}
