public class OverloadingDemo {
    public static void main(String[] args) {

    }

    // Chu ki cua phuong thuc gom ten phuong thuc va danh sach tham so
    // sum(int, int)
    public int sum(int a, int b) {
        return a + b;
    }

    // sum(int, byte)
    public int sum(int a, byte b) {
        return a + b;
    }
}
