package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Tinh da hinh
        // Student -> Person
        Student student = new Student("Huy",24);
        student.run();
        student.study();
        Person person = student;
        person.run();

        // instanceof
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);

        if(person instanceof Student){
            Student s = (Student) person;
            s.study();
        }

    }
}
