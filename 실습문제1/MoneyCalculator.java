import java.util.Scanner;

public class MoneyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        System.out.print("지불할 금액을 입력하세요: ");
        int amount = scanner.nextInt();

        for (int unit : currency) {
            int count = amount / unit;
            amount %= unit;
            System.out.println(unit + "원권: " + count + "매");
        }
        scanner.close();
    }
}
