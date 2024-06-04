

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // Tao so nguyen ngau nhien
        int n = random.nextInt();
        System.out.println("n = " + n);

        // 0 <= m < max
        int m = random.nextInt(100);
        System.out.println("m = " + m);

        // min <= k <= max
        // min + ramdom.nextInt(max - min +1)
        int min = 100;
        int max = 999;
        int k = min + random.nextInt(max - min + 1);
        System.out.println("k = " + k);

        // Lay ngau nhien phan tu trong mang
        String[] fruits = {"cam","quyt", "tao","dua"};
        int f = random.nextInt(fruits.length);
        String fa = fruits[f];
        System.out.println("fa = " + fa);
    }
}
