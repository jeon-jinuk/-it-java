import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1-99 사이의 정수를 입력하세요: ");
        int number = scanner.nextInt();
        int count = 0;
        String numStr = Integer.toString(number);

        for (char c : numStr.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("박수짝");
        } else if (count > 1) {
            System.out.println("박수짝짝");
        } else {
            System.out.println("박수 없음");
        }

        scanner.close();
    }
}
