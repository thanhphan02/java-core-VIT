import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhat vao ho ten: ");
        String fullName = scanner.nextLine();
        System.out.println("Ho ten cua ban la: " + fullName);

        System.out.println("Moi ban nhap tuoi:");
        int age = scanner.nextInt();
        System.out.println("tuoi cua ban la: " + age);

//        scanner.nextInt(); // An enter (dung cho truoc nextLine())

        System.out.println("Moi ban nhap vao gioi tinh: ");
        System.out.println("1.Nam");
        System.out.println("2.Nu");
        int menu = scanner.nextInt();
        Gender gender;
        if (menu ==1){
            gender = Gender.MALE;
        }
        else   {
            gender = Gender.FEMALE;
        }
        System.out.println("Gioi tinh cua ban la: " + gender);


    } // Nhap du lieu tu ban phim
}
