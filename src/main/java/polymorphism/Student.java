package polymorphism;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    public void study(){
        System.out.println("Student is studing... ");
    }

    @Override
    public void run() {
        System.out.println("Student is running");
    }
}
