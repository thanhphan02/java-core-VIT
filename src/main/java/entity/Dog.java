package entity;

public class Dog {
    public String name;
    protected int age;
    String color;
    private int id;
    public Dog(){
        System.out.println("Khoi tao 0 tham so");
    }
    public Dog(String name){
        System.out.println("Khoi tao 1 tham so");
        this.name = name;
    }

    public Dog(String name, int age){
        System.out.println("Khoi tao 2 tham so");
        this.name = name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}

