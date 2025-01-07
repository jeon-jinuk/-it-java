import java.util.HashSet;
import java.util.Random;

public class RandomMultiples {
    public static void main(String[] args) {
        int[] array = new int[10];
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        int count = 0;
        while (count < 10) {
            int num = random.nextInt(100) + 1; // 1~100 사이 랜덤 수
            if (num % 3 == 0 && !set.contains(num)) {
                set.add(num);
                array[count++] = num;
            }
        }

        System.out.println("3의 배수 배열:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
