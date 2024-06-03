import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kieu so nguyen
        // byte (1), short (2), int (4), long (8)
        int age = 18;
        System.out.println("age = " + age);

        // Kieu so thuc
        // fload (4), double(8)
        double pi = 3.14159;
        System.out.println("pi = " + pi);

        // Kieu logic
        // Boolean
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kieu ki tu
        // char (2)
        char c = 'T';
        System.out.println("c = " + c);


        // Kieu xau ki tu
        //String
        String s = "Java Core";
        System.out.println("s = " + s);

        // Kieu thoi gian
        // LocalDate, LocalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(2002, 5, 14);
        System.out.println("date = " + date);

        // Kiểu enum
        UiState state = UiState.ERROR;
        System.out.println("state = " + state);

        // Kiểu mảng
        int[] numbers = {2, 5, 9, 4, 1};
        System.out.println("numbers = " + numbers.length);
        // Chi so bat dau tu 0
        System.out.println("numbers[0] = " + numbers[0]);
        // Cách khởi tạo khác
        String[] fruits = new String[]{"CAM", "MAN", "Tao"};
        char[] characters = new char[10];
        System.out.println("characters = " + characters.length);
        System.out.println("characters[0] = " + characters[0]);
        characters[0] = 'k';
        System.out.println("characters[0] = " + characters[0]);
    }
}
